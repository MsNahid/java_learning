package com.ant.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainClass {

    public static void main(String[] args) {

        List<Employee> employeeList = Arrays.asList(new Employee(27, "Nahid"),
               new Employee(26, "Book"));

        List<Employee> deepCopyEmployee = new ArrayList<>();


        for(Employee employee: employeeList){
            deepCopyEmployee.add(new Employee(employee.getAge(), employee.getName()));
        }

        System.out.println("Deep:");
        for(Employee employee: deepCopyEmployee){
            employee.setAge(employee.getAge() + 20);
        }
        for(Employee employee: deepCopyEmployee){
            System.out.println(employee);
        }

        System.out.println("Original:");

        for(Employee employee: employeeList){
            System.out.println(employee);
        }





    }
}
