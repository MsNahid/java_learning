package com.ant.generic;

public class Animal {

    private double age;

    public void eat(){
        System.out.println(this.getClass().getSimpleName() + " is Eating");
    }
}
