package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class FileReaderAlpha {

    public static void main(String[] args) throws Exception {

        FileReader file = new FileReader("C:/Users/Usuario/Desktop/alphabeta5465.txt");

        BufferedReader buff = new BufferedReader(file);

        for (String line = "";line != null;) {
            line = buff.readLine();
            if (line != null) {
                System.out.print(line);
            }
        }


    }
}
