package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main5 {

    //Ex 1

    public static void main(String[] args)  {
        FileInputStream file = null;

        try{
            file = new FileInputStream("Input_Output_Files/file.txt");
        }
        catch(FileNotFoundException e ){
            System.out.println("File not found!!!");
            System.exit(1);
        }

        int line = 0;

        try{
            line = file.read();
            while(line != -1)
            {
                System.out.print((char)line);
                line = file.read();
            }
        }
        catch(IOException e){
            System.out.println("Reading error!!!");
            System.exit(2);
        }

        try{
            file.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}


