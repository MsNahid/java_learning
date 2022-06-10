package com.ant.oop.singleton;

public class SingletonExample {

    private static SingletonExample singletonExample;

    private SingletonExample(){

    }

    public static SingletonExample getInstance(){
        if(singletonExample == null){
            singletonExample = new SingletonExample();
        }

        return singletonExample;
    }

    public void message(){
        System.out.println("Singleton Created");
    }
}
