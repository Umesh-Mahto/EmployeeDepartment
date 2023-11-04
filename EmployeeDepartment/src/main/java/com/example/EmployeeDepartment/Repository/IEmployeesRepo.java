package com.example.EmployeeDepartment.Repository;

import com.example.EmployeeDepartment.Model.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployeesRepo extends JpaRepository<Employees,Long> {
}
