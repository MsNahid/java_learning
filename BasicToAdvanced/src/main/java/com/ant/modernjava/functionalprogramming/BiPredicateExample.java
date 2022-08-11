package com.ant.modernjava.functionalprogramming;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;

public class BiPredicateExample {

    public static void main(String[] args) {

        List<Instructor> instructorList = Instructors.getAll();



        // BiPredicate
        BiPredicate<Boolean, Double> onlineCoursesAndAge = (onlineCourse, age) -> onlineCourse == true && age > 12.00;

        BiConsumer<String, List<String>> nameAndCourses = (name, courses) ->
                System.out.println("Name: " + name + ", Courses: " + courses);

        instructorList.forEach(instructor -> {
            if(onlineCoursesAndAge.test(instructor.isOnlineCourses, instructor.age)){
                nameAndCourses.accept(instructor.getName(), instructor.getCourses());
            }
        });
    }
}
