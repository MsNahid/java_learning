package com.ant.modernjava.functionalprogramming;

import java.util.List;
import java.util.function.Predicate;

public class PredicateExample2 {

    public static void main(String[] args) {
        // islOnline courses = true
        Predicate<Instructor> pred1 = (p) -> p.isOnlineCourses == true;

        // age > 12

        Predicate<Instructor> pred2 = (p) -> p.age > 12.00;

        List<Instructor> instructorList = Instructors.getAll();

        // who teaches online
        instructorList.forEach(instructor -> {
            if(pred1.test(instructor)){
                System.out.println(instructor);
            }
        });

        System.out.println("-----------------------------------------");
        // teaches online and age > 12.00
        instructorList.forEach(instructor -> {
            if(pred1.and(pred2).test(instructor)){
                System.out.println(instructor);
            }
        });
    }
}
