package com.DG.Template.controller;

import com.DG.Template.config.DbContextHolder;
import com.DG.Template.model.Employee;
import com.DG.Template.repository.EmployeeRepository;
import com.DG.Template.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/temp")
public class EmployeeController {

//    @Autowired
//    EmployeeRepository employeeRepository;

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private ApplicationContext applicationContext;

//    @GetMapping("/emp")
//    public List<Employee> getAllEmp(){
//        return employeeRepository.findAll();
//    }

    @GetMapping("/getEmp")
    public String connectToDb(@RequestHeader(name = "X-TENANT-ID") String env) { //  See Headers
        try {
            String tenantStr = "persistence-tenant_emp_" + env;
            StringBuilder responseStr = new StringBuilder();
            DbContextHolder.setCurrentDb(tenantStr);

            List<Employee> empList = employeeService.listEmp();
            for(Employee e :empList){
                responseStr.append(e.getEmp_id() + " |" + e.getEmp_name()  + System.lineSeparator());
            }
            System.out.println(responseStr.toString());

            return responseStr.toString();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return "Failure";
        }
    }

//    @PostMapping("/emp")
//    public Employee addEmp(@RequestBody Employee employee){
//        return employeeRepository.save(employee);
//    }
}
