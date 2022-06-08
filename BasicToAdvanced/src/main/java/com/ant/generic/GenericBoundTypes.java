package com.ant.generic;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class GenericBoundTypes <T extends Animal>{

    T thingsToPrint;

    public void methodOfThingsToPrint(){
        System.out.println(this.getClass().getSimpleName() + " is printed");
        thingsToPrint.eat();
    }
}
