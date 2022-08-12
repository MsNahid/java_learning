package com.ant.modernjava.functionalprogramming;

import java.util.function.Predicate;

public class ConvertToMethodReference {

    public static void main(String[] args) {

        Predicate<Instructor> p1 = ConvertToMethodReference::greaterThanTwelveYearsOfAge;

        Instructors.getAll().forEach(instructor -> {
            if(p1.test(instructor)){
                System.out.println(instructor);
            }
        });
    }

    public static Boolean greaterThanTwelveYearsOfAge(Instructor instructor){
        if(instructor.getAge() > 12.00){
            return true;
        }

        return false;
    }
}
