package com.example.demo;

public class EmployeeService {

    public static void main(String[] args) {


        try {
            StudentService es= (StudentService) Class.forName("com.example.demo.StudentService").newInstance();

            String objectCreationNewway=es.creatingNewObject();
            System.out.println("object creation"+objectCreationNewway);
        } catch (InstantiationException e) {
            System.out.println("classNotFoundException"+e);
        } catch (IllegalAccessException e) {
            System.out.println("IllegalAccessException"+e);
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException"+e);

        }catch (Exception e){
            System.out.println("Exception"+e);

        }

    }
}
