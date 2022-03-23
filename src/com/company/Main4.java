package com.company;

public class Main4 {

    public static void main(String[] args) {
        String text = "Ala ma kota-A kot ma Ale";
        String[] splitted = text.split("-");

        for( int i = 0 ; i < splitted.length ; i++)
        {
            System.out.println((i+1)+"."+splitted[i]);
        }
    }
}


