package com.ant.modernjava.functionalprogramming;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class PredicateBiConsumerExample {

    public static void main(String[] args) {

        List<Instructor> instructorList = Instructors.getAll();

        Predicate<Instructor> onlineClass = (instructor) -> instructor.isOnlineCourses == true;

        Predicate<Instructor> ageGreaterThanTwelve = (instructor) -> instructor.age > 12.00;

        BiConsumer<String, List<String>> nameAndCourses = (name, courses) ->
                System.out.println("Name: " + name + ", Courses: " + courses);

        instructorList.forEach(instructor -> {
            if(onlineClass.and(ageGreaterThanTwelve).test(instructor)){
                nameAndCourses.accept(instructor.getName(), instructor.getCourses());
            }
        });
    }
}
