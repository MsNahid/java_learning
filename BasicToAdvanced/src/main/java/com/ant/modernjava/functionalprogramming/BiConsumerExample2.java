package com.ant.modernjava.functionalprogramming;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample2 {

    public static void main(String[] args) {

        List<Instructor> instructorList = Instructors.getAll();

        BiConsumer<String, String> stringStringBiConsumer = (name, gender) -> System.out.println("Name: " + name + ", Gender: " + gender);


        instructorList.forEach(instructor -> {
            stringStringBiConsumer.accept(instructor.getName(), instructor.getGender());
        });

        BiConsumer<String, List<String>> stringListBiConsumer = (name, courses) -> System.out.println("Name: " + name + ", Courses: " + courses);

        System.out.println("Name and Courses: ");
        instructorList.forEach(instructor -> {
            if(instructor.getAge() > 12.00){
                stringListBiConsumer.accept(instructor.getName(), instructor.getCourses());
            }
        });
    }
}
