package com.example.EmployeeDepartment.Controller;

import com.example.EmployeeDepartment.Model.Department;
import com.example.EmployeeDepartment.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;


    @PostMapping("/addDepartment")
    public String addDepartment( @RequestBody Department department){
        return departmentService.addDepartment(department);
    }
    @GetMapping("/getAllDepartment")
    public List<Department> getAllDepartment(){
        return departmentService.getAllDepartment();
    }
    @PutMapping("/updateDepartment")
    public String updateDepartment(@RequestBody Department department){
        return departmentService.updateDepartment(department);
    }
    @DeleteMapping("/deleteById/{id}")
    public  String deleteById(@PathVariable long id){
        return departmentService.deleteById(id);
    }
}
