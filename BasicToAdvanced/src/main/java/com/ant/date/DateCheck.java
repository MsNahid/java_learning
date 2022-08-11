package com.ant.date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateCheck {

    public static void main(String[] args) {



        System.out.println(LocalDate.now().format(DateTimeFormatter.ofPattern("dd-MM-YYYY")));
        LocalDate.now().format(DateTimeFormatter.ofPattern("dd-MM-YYYY"));

    }
}

