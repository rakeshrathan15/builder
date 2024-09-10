package com.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
public class EmployeeDBController {
    @GetMapping(value = "/getEmpList")
    public List<Employee> getEmployee(){
       EmployeeDBService employeeDBService= new EmployeeDBService();
       return employeeDBService.getEmployeeList();
    }


}
