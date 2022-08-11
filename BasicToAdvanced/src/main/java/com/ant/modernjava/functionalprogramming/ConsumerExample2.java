package com.ant.modernjava.functionalprogramming;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample2 {

    public static void main(String[] args) {

        List<Instructor> instructorList = Instructors.getAll();

        Consumer<Instructor> instructorConsumer = (instructor) -> System.out.println(instructor);

        instructorList.forEach(instructorConsumer);

        // print only name
        Consumer<Instructor> instructorConsumerName = (instructor) -> System.out.println(instructor.getName());

        //print only age
        Consumer<Instructor> instructorConsumerAge = (instructor) -> System.out.print(instructor.getAge());

        //print only title
        Consumer<Instructor> instructorConsumerTitle = (instructor) -> System.out.println(instructor.getTitle());

        Consumer<Instructor> instructorConsumerCourse = (instructor) -> System.out.println(instructor.getCourses());

        System.out.println("------------------------------------------------------------------------------------------");
        instructorList.forEach(instructorConsumerName);

        System.out.println("#####################################################");

        instructorList.forEach(instructorConsumerName.andThen(instructorConsumerTitle).andThen(instructorConsumerAge).andThen(instructorConsumerCourse));

        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        instructorList.forEach(instructor -> {
            if(instructor.getAge() > 12.00){
//                instructorConsumer.accept(instructor);
                 instructorConsumerName.andThen(instructorConsumerTitle).accept(instructor);
            }
        });




    }
}
