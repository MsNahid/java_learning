package com.ant.modernjava.functionalprogramming;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalExample2 {

    public static void main(String[] args) {

        Predicate<Instructor> instructorPredicate = (ins) -> ins.isOnlineCourses == true;

        Function<List<Instructor>, Map<String, Double>> mapFunction =
                (instructorList -> {
                    Map<String, Double> resMap = new HashMap<>();

                    instructorList.forEach(instructor -> {
                        if(instructorPredicate.test(instructor)){
                            resMap.put(instructor.name, instructor.age);
                        }
                    });

                    return resMap;

                });

        System.out.println(mapFunction.apply(Instructors.getAll()));


//        Function<List<Instructor>, Map<String, Integer>> mapFunction2 = new Function<List<Instructor>, Map<String, Integer>>() {
//            @Override
//            public Map<String, Integer> apply(List<Instructor> instructorList) {
//                return null;
//            }
//        }
    }
}
