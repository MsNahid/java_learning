package com.ant.modernjava.functionalprogramming;

import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {

        // if a number is > 10 return true instead false
        Predicate<Integer> integerPredicate = (val) -> val > 10;

        System.out.println(integerPredicate.test(11));

        // i > 10 && i is even
        Predicate<Integer> evenPredicate = (val) -> val % 2 == 0;

        System.out.println(integerPredicate.and(evenPredicate).test(20));

        // i > 10 || i is even
        System.out.println(integerPredicate.or(evenPredicate).test(11));

        // i > 10 and i is odd
        System.out.println(integerPredicate.and(evenPredicate).negate().test(13));

    }
}
