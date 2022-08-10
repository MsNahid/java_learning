package com.ant.lambda.predicate;

import java.util.function.Predicate;

public class PredicateInterfaceExampleOne {

    // predicate in function
    public static void  pred(int number, Predicate<Integer> predicate) {

        if (predicate.test(number)) {
            System.out.println("Number " + number);
        }

    }

    public static void main(String[] args) {

        // creating predicate
        Predicate<Integer> lesserThan = i -> (i < 10);

        System.out.println(lesserThan.test(15));

        // predicate chaining
        Predicate<Integer> greaterThanTen = i -> (i > 10);
        Predicate<Integer> lowerThanTwenty = i -> (i < 20);

        Boolean result = greaterThanTen.and(lowerThanTwenty).test(15);

        System.out.println(result);

        Boolean result2 = greaterThanTen.and(lowerThanTwenty).negate().test(15);

        System.out.println(result2);

        pred(10, (i) -> i > 7);


    }


}
