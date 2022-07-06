package com.ant.staticblock;

public class Human {

    private static int a;

    int j = 10;

    Human(){
        System.out.println("Human Constructor Is Called.");
    }

    static{
        a = 100;
        System.out.println("Static block is invoked before constructor.\n");
    }

    public static void main(String[] args) {
        Human human = new Human();
    }
}
