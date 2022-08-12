package com.ant.modernjava.functionalprogramming;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    public static void main(String[] args) {

        BinaryOperator<Integer> binaryOperator = (a, b) -> a + b;

        System.out.println(binaryOperator.apply(2, 4));

        Comparator<Integer> comparator = (a, b) -> a.compareTo(b);

        BinaryOperator<Integer> maxBi = BinaryOperator.maxBy(comparator);

        BinaryOperator<Integer> minBi = BinaryOperator.minBy(comparator);

        System.out.println(maxBi.apply(10, 100));
        System.out.println(minBi.apply(5, 600));


    }
}
