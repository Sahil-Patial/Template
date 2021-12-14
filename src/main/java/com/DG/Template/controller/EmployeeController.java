package com.DG.Template.controller;

import com.DG.Template.model.Employee;
import com.DG.Template.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/temp")
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping("/emp")
    public List<Employee> getAllEmp(){
        return employeeRepository.findAll();
    }

    @PostMapping("/emp")
    public Employee addEmp(@RequestBody Employee employee){
        return employeeRepository.save(employee);
    }
}
