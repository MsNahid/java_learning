package com.ant.modernjava.functionalprogramming;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Instructor {

    String name;

    Double age;

    String title;

    String gender;

    List<String> courses;
}
