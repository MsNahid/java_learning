package com.ant.modernjava.functionalprogramming;

import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {

//        Consumer Single Statement
        Consumer<String> consumer = (x) -> System.out.println(x.length() + " value is: " + x);

        consumer.accept("book da boi");

//        Consumer multiple statement

        Consumer<Integer> integerConsumer = (x) -> {
            System.out.println("x * x = " + x * x);
            System.out.println("x + x = " + x + x);
        };

        integerConsumer.accept(10);
    }



}
