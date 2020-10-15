package com.company;

import java.io.File;
import java.io.PrintWriter;

public class NumsToFile1 {

    public static void main(String[] args) throws Exception {


        File file = new File("C:/Users/Usuario/Desktop/Num11001200.txt");
        PrintWriter pwInput = new PrintWriter(file);




        for (int i = 1100; i <= 1200; i++) {
            pwInput.println(i);
        }

        pwInput.close();
    }
}
