package com.ant.generic;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class DemoClass {

    public <T> void genericMethod(T data){
        System.out.println("Generic Method");
        System.out.println("Data: "+ data);
    }


}
