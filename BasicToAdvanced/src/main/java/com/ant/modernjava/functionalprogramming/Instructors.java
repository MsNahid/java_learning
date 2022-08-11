package com.ant.modernjava.functionalprogramming;

import java.util.Arrays;
import java.util.List;

public class Instructors {

    public static List<Instructor> getAll(){

        Instructor instructor1 = new Instructor("Nahid", 27.00, "Huntsman", "Male", Arrays.asList("c++", "math", "accounting"));

        Instructor instructor2 = new Instructor("Hujur Nahid", 25.00, "Luchu", "Female", Arrays.asList("c++", "Android", "accounting"));

        Instructor instructor3 = new Instructor("Aminul", 12.00, "Bepari", "Male", Arrays.asList("c++", "Qa", "accounting"));

        List<Instructor> instructorList = Arrays.asList(instructor1, instructor2, instructor3);

        return instructorList;
    }
}
