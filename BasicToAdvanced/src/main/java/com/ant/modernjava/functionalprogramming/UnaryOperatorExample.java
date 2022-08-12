package com.ant.modernjava.functionalprogramming;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

    public static void main(String[] args) {

        UnaryOperator<Integer> unaryOperator = (i) -> i * 10;

        Function<Integer, Integer> function = (i) -> i * 10;

        System.out.println(unaryOperator.apply(10));

        System.out.println(function.apply(10));


    }
}
