package com.ant.modernjava.functionalprogramming;

import java.util.function.Function;

public class FunctionalExample {

    public static void main(String[] args) {

        Function<Integer, Double> sqrt = (n) -> Math.sqrt(n);

        System.out.println(sqrt.apply(10));

        Function<String, String> lowerCaseFunction = (s) -> s.toLowerCase();

        System.out.println(lowerCaseFunction.apply("PRograMMing"));

        Function<String, String> concatFunction = (s) -> s.concat(" In java");

        System.out.println(lowerCaseFunction.andThen(concatFunction).apply("Programming"));

        System.out.println(lowerCaseFunction.compose(concatFunction).apply("Programming"));


    }
}
