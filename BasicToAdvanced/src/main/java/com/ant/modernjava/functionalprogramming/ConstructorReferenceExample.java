package com.ant.modernjava.functionalprogramming;

import java.util.Arrays;

public class ConstructorReferenceExample {

    public static void main(String[] args) {

        InstructorFactory instructorFactory = Instructor::new;
        Instructor instructor = instructorFactory.getInstructor("Moon", 23.00, "Student",
                "Male", false, Arrays.asList("Discrete Math", "Python", "Ruby"));

        System.out.println(instructor);
    }
}
