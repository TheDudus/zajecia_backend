package com.company;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Main6 {

    //Ex 2

    public static void main(String[] args) throws FileNotFoundException, IOException {

        try(FileOutputStream file_output = new FileOutputStream("Input_Output_Files//Output_file.txt")) {
            String text = "Duis ac risus placerat metus lacinia ornare in nec ex.";
            byte[] text_to_bytes = text.getBytes(StandardCharsets.UTF_8);

            file_output.write(text_to_bytes);
        }
    }
}


