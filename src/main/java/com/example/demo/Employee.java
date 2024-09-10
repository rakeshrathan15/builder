package com.example.demo;

public class Employee {

    private String empId;

    private String name;

    private String designation;

    private int salary;

    private Employee(){

    }

    public static Employee bulid(){
        return  new Employee();
    }

    public Employee setEmpId(String empId) {
        this.empId = empId;
        return this;
    }

    public String getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public int getSalary() {

        return salary;
    }

    public Employee setName(String name) {
        this.name = name;
        return  this;
    }

    public Employee setDesignation(String designation) {
        this.designation = designation;
        return  this;
    }

    public Employee setSalary(int salary) {
        this.salary = salary;
        return  this;
    }
}
