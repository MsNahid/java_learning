package com.ant.lambda;

public class IncrementByFiveTraditional implements IncrementByFiveInterface{

    public static void main(String[] args) {

        IncrementByFiveTraditional incrementByFiveTraditional = new IncrementByFiveTraditional();

        System.out.println(incrementByFiveTraditional.incrementByFive(5));

    }

    @Override
    public int incrementByFive(int a) {
        return a + 5;
    }
}
