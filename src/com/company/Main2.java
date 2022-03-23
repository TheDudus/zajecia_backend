package com.company;

import java.time.*;


public class Main2 {

    public static void main(String[] args){
        System.out.println(java.time.LocalTime.now());

        ZoneId global = ZoneId.of("Etc/Greenwich");
        System.out.println(java.time.ZonedDateTime.now(global));
    }
}


