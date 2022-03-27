package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main4 {

    //Ex 6

    public static void main(String[] args) {

        FileInputStream file = null;

        try{
            file = new FileInputStream("Input_Output_Files/lorem.txt");
        }
        catch(FileNotFoundException e ){
            System.out.println("File not found!!!");
            System.exit(1);
        }

        int line = 0;
        String file_text = "";

        try{
            line = file.read();
            while(line != -1)
            {
                file_text = file_text + (char)line;
                line = file.read();
            }
        }
        catch(IOException e){
            System.out.println("Reading error!!!");
            System.exit(2);
        }
        //System.out.println(file_text);
        String[] splitted = file_text.split("-");

        for( int i = 0 ; i < splitted.length ; i++)
        {
            System.out.println((i+1)+"."+splitted[i]);
        }
    }
}


