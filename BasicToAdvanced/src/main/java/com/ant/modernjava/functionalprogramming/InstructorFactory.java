package com.ant.modernjava.functionalprogramming;

import java.util.List;

public interface InstructorFactory {

    abstract Instructor getInstructor(String name, Double age, String title, String gender, Boolean isOnlineCourses, List<String> courses);



}
