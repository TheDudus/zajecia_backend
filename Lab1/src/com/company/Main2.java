package com.company;

import java.time.*;


public class Main2 {
    //Ex 5
    public static void main(String[] args){
        System.out.println(java.time.LocalTime.now());

        ZoneId global = ZoneId.of("GMT");
        System.out.println(java.time.ZonedDateTime.now(global));
    }
}


