package com.ant.modernjava.functionalprogramming;

import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void main(String[] args) {

        BiConsumer<Integer, Integer> integerBiConsumer = (x, y) -> System.out.println("X: " + x + ", Y: " + y);

        BiConsumer<String, String> stringStringBiConsumer = (s1, s2) -> System.out.println("s1 + s2: " + s1 + " " + s2 + ".");

        BiConsumer<Integer, Integer> integerBiConsumerSum = (x, y) -> System.out.println("(X + Y) : " + x + y);

        integerBiConsumer.accept(10, 5);

        stringStringBiConsumer.accept("Hello", "World");

        integerBiConsumerSum.accept(10, 5);

    }
}
