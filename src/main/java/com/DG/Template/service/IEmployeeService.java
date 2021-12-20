package com.DG.Template.service;

import com.DG.Template.model.Employee;
import com.DG.Template.repository.EmployeeRepository;

import java.util.List;

public interface IEmployeeService {
    void addEmp(Employee input);

    List<Employee> listEmp();

    void setEmpDao(EmployeeRepository empDao);
}
