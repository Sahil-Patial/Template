package com.DG.Template.service;

import com.DG.Template.model.Employee;
import com.DG.Template.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements IEmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void addEmp(Employee input){
        employeeRepository.save(input);
    }

    @Override
    public List<Employee> listEmp() {
        return employeeRepository.findAll();
    }

    @Override
    public void setEmpDao(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }
}
