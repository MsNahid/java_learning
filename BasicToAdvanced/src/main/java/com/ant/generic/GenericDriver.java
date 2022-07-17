package com.ant.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericDriver {

    public static void main(String[] args) {

        GenericClass<Integer> intObj = new GenericClass<>(5);

        System.out.println(intObj.getData());

        GenericClass<Double> doubleGenericClass = new GenericClass<>(5.0);

        System.out.println(doubleGenericClass.getData());

        GenericClass<String> stringGenericClass = new GenericClass<>("Java Programming.");

        System.out.println(stringGenericClass.getData());
        System.out.println("'\n\n################################\n\n");

        DemoClass demoClass = new DemoClass();
        demoClass.genericMethod("Meta");

        Animal animal = new Animal();
        animal.eat();

        Dog dog = new Dog();
        dog.eat();

        Cat cat = new Cat();
        cat.eat();

        List<Object> objectList = new ArrayList<>();
        objectList.add(cat);
        objectList.add(dog);

        Cat cat1 = (Cat)objectList.get(0);
        Dog dog1 = (Dog)objectList.get(1);

        cat1.eat();
        dog1.eat();

        // using generic for safe type casting
        List<Cat> catList = new ArrayList<>();
        catList.add(cat1);
//        catList.add(dog1); // compile time error

        GenericBoundTypes<Cat> catGenericBoundTypes = new GenericBoundTypes<>(new Cat());
        catGenericBoundTypes.methodOfThingsToPrint();

        methodOfGeneric("book");
        methodOfGeneric(12.666);

        System.out.println(methodOfGenericReturn("book", 12));


    }

    public static <T> void  methodOfGeneric(T thingsToShout){
        System.out.println(thingsToShout + " !!!!");
    }

    public static <T, V> V methodOfGenericReturn(T t, V v){
        return v;
    }

}
