package com.example.EmployeeDepartment.Service;

import com.example.EmployeeDepartment.Model.Department;
import com.example.EmployeeDepartment.Repository.iDepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    iDepartmentRepo idepartmentRepo;

    public String addDepartment(Department department) {
        idepartmentRepo.save(department);
        return "department added";
    }

    public List<Department> getAllDepartment() {
        return idepartmentRepo.findAll();
    }

    public String updateDepartment(Department department) {
        idepartmentRepo.save(department);
        return "updated successfully";
    }

    public String deleteById(long id) {
        idepartmentRepo.deleteById(id);
        return "id deleted successfully";
    }
}
