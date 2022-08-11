package com.ant.modernjava.functionalprogramming;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample2 {

    public static void main(String[] args) {

        Predicate<Instructor> instructorPredicate = (ins) -> ins.isOnlineCourses == true;

        BiFunction<List<Instructor>, Predicate<Instructor>, Map<String, Double>> mapBiFunction =
                ((instructorList, instructorPredicate1) -> {

                    Map<String, Double> stringDoubleMap = new HashMap<>();

                    instructorList.forEach(instructor -> {
                        if(instructorPredicate.test(instructor)){
                            stringDoubleMap.put(instructor.name, instructor.age);
                        }
                    });

                    return stringDoubleMap;

                });


        System.out.println(mapBiFunction.apply(Instructors.getAll(), instructorPredicate));
    }
}
