package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class EmployeeDBService {


    public static Function<ResultSet, List<Employee>> empExtractor =(rs) ->{
          
        List<Employee> employeeList = new ArrayList<>();

        try {
            while (rs.next()){
                String name=rs.getString("name");
                String empId= rs.getString("empid");
                int salary=rs.getInt("salary");
                String designation=rs.getString("designation");

                Employee e = Employee.bulid().setName(name).setEmpId(empId).setDesignation(designation).setSalary(salary);
                employeeList.add(e);

            }

        }catch (Exception e){

            System.out.println("Exception"+e);
        }
         return  employeeList;
    };


    public List<Employee> getEmployeeList(){

        List<Employee>employeeList=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://@localhost:3306/swiggy",
                    "root","rakesh");
            Statement stmt= con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from swiggy.employee");


           employeeList=empExtractor.apply(rs);
            for(int i=0;i<employeeList.size();i++){

               Employee e= employeeList.get(i);
                System.out.println("name: "+e.getName()+" empid: "+e.getEmpId()+"salary: "+e.getSalary()+"desgination: "+e.getDesignation());
            }


        }catch (Exception e){

            System.out.println("Exception"+e);
        }

        return  employeeList;


    }

    public static void main(String[] args) {


    }
}
