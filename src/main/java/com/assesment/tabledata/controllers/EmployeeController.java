package com.assesment.tabledata.controllers;

import com.assesment.tabledata.entity.Employee;
import com.assesment.tabledata.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/")
    public List<Employee> getEmployees() {
        return employeeService.retrieveEmployees();
    }
}
