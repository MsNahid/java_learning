package com.ant.modernjava.functionalprogramming;

import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceExample {

    public static void main(String[] args) {

        Predicate<Instructor> p1 = instructor -> instructor.isOnlineCourses;
        Predicate<Instructor> p2 = Instructor::getIsOnlineCourses;

        Function<Integer, Double> sqrt = a -> Math.sqrt(a);
        Function<Integer, Double> sqrt1 = Math::sqrt;

        Function<String, String> lowerCaseFunction = s -> s.toLowerCase();
        Function<String, String> lowerCaseFunction1 = String::toLowerCase;

    }
}
