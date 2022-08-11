package com.ant.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListClone {

    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();

        List<Integer> deepCopy = new ArrayList<>();

        Iterator<Integer> iterator = integerList.iterator();

//        while(iterator.hasNext()){
//            iterator.next().clone();
//        }

        integerList.add(10);
        integerList.add(11);
        integerList.add(12);

        List<Integer> integerListClone;
        integerListClone = integerList;

        integerList.set(0, 100);

        System.out.println("Clone: ");
        for(Integer val : integerListClone){
            System.out.println(val);
        }

        integerListClone.set(2, 600);

        System.out.println("\nOriginal:\n");
        for(Integer val : integerList){
            System.out.println(val);
        }
    }
}
