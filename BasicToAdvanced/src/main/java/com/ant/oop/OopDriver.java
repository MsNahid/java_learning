package com.ant.oop;

import com.ant.oop.singleton.SingletonExample;

public class OopDriver {

    public static void main(String[] args) {

        SingletonExample singletonExample;

        singletonExample = SingletonExample.getInstance();

        singletonExample.message();

    }
}
