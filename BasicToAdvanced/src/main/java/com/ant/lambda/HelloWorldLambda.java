package com.ant.lambda;

public class HelloWorldLambda {

    public static void main(String[] args) {
//        HelloWorldInterface helloWorldInterface = () -> {
//           return "Hello World!";
//        };

        HelloWorldInterface helloWorldInterface = () -> "Hello World, Hey";

        System.out.println(helloWorldInterface.sayHello());
    }

    public static class ConcatenateInterface {
    }
}
