package com.ant.oop;

import com.ant.oop.instance.of.Animal;
import com.ant.oop.instance.of.Dog;
import com.ant.oop.singleton.SingletonExample;

public class OopDriver {

    public static void main(String[] args) {

        SingletonExample singletonExample;

        singletonExample = SingletonExample.getInstance();

        singletonExample.message();

        System.out.println("Instance Of");

        String str = "Go Big";

        System.out.println(str instanceof String);

        Dog d = new Dog();
        Dog d2 = new Dog();
        //Animal a = new Dog();
        System.out.println(d instanceof Dog);

        System.out.println(d instanceof Animal);

    }
}
