package com.ant.lambda;

public class HelloWorldTraditional implements  HelloWorldInterface{
    @Override
    public String sayHello() {
        return "Hello World";
    }

    public static void main(String[] args) {

        HelloWorldTraditional helloWorldTraditional = new HelloWorldTraditional();

        System.out.println(helloWorldTraditional.sayHello());

    }
}
