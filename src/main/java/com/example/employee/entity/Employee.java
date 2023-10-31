package com.example.employee.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee_table")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employeeId;
    private String employeeName;
    private int salary;
    private String address;
    private String designation;
    private String primarySkill;

 

    public Employee(String employeeName, int salary, String address, String designation, String primarySkill) {
        this.employeeName = employeeName;
        this.salary = salary;
        this.address = address;
        this.designation = designation;
        this.primarySkill = primarySkill;
    }

 

    public Employee() {
    }

 

    public int getEmployeeId() {
        return employeeId;
    }

 

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

 

    public String getEmployeeName() {
        return employeeName;
    }

 

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

 

    public int getSalary() {
        return salary;
    }

 

    public void setSalary(int salary) {
        this.salary = salary;
    }

 

    public String getAddress() {
        return address;
    }

 

    public void setAddress(String address) {
        this.address = address;
    }

 

    public String getDesignation() {
        return designation;
    }

 

    public void setDesignation(String designation) {
        this.designation = designation;
    }

 

    public String getPrimarySkill() {
        return primarySkill;
    }

 

    public void setPrimarySkill(String primarySkill) {
        this.primarySkill = primarySkill;
    }
}
