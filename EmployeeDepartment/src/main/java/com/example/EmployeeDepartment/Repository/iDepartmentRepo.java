package com.example.EmployeeDepartment.Repository;

import com.example.EmployeeDepartment.Model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iDepartmentRepo extends JpaRepository<Department,Long> {
}
