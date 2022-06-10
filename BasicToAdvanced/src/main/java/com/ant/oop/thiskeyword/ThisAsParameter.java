package com.ant.oop.thiskeyword;

public class ThisAsParameter {

    int x;
    int y;

    ThisAsParameter(int x, int y){
        this.x = x;
        this.y = y;

        System.out.println("Before Calling add");
        System.out.println("X : " + this.x + " ,Y : " + this.y);
        add(this);

        System.out.println("After Calling add");
        System.out.println("X : " + this.x + " ,Y : " + this.y);

    }

    private void add(ThisAsParameter tp){
        tp.x = tp.x + 2;
        tp.y = tp.y + 2;
    }

    public static void main(String[] args) {

        ThisAsParameter thisAsParameter = new ThisAsParameter(10, 12);
    }
}
