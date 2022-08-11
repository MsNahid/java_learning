package com.ant.srabon;

public class NumberTheoryFromSrabon {

    public static void main(String[] args) {

        fun(1000);
        fun(9999);
        fun(99999);
        fun(888);

    }

    public static void fun(int x){
        if(x < 1000){
            System.out.println("Input format not valid");
            return;
        }

        int contient = x -(x%1000);

        System.out.println(contient);


    }
}
