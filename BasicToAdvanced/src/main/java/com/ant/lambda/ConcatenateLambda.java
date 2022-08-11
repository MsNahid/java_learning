package com.ant.lambda;

public class ConcatenateLambda {

    public static void main(String[] args) {
        ConcatenateInterface concatenateInterface = (a, b) -> a + " " + b;

        System.out.println(concatenateInterface.sConcatenate("Hello", "World"));
    }
}
