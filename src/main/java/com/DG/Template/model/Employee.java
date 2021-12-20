package com.DG.Template.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "Employee")
public class Employee implements Serializable {

    @Id
    @Column(name="emp_id")
    private Integer emp_id;

    @Column(name = "emp_name")
    private String emp_name;

    public Employee(){

    }

    public Employee(Integer emp_id, String emp_name){
        this.emp_id = emp_id;
        this.emp_name = emp_name;
    }

    public Integer getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(Integer emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }
}


