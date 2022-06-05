package com.ant.generic;

public class GenericDriver {

    public static void main(String[] args) {

        GenericClass<Integer> intObj = new GenericClass<>(5);

        System.out.println(intObj.getData());

        GenericClass<Double> doubleGenericClass = new GenericClass<>(5.0);

        System.out.println(doubleGenericClass.getData());

        GenericClass<String> stringGenericClass = new GenericClass<>("Java Programming.");

        System.out.println(stringGenericClass.getData());
    }
}
