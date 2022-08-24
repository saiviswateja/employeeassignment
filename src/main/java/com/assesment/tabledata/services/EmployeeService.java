package com.assesment.tabledata.services;

import com.assesment.tabledata.entity.Employee;
import com.assesment.tabledata.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> retrieveEmployees() {
        return employeeRepository.findAll();
    }
}