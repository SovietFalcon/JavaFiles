package com.company;

import java.io.File;
import java.io.PrintWriter;

public class CharsToFile1 {

    public static void main(String[] args) throws Exception {

        File file = new File("C:/Users/Usuario/Desktop/alphabeta.txt");

        PrintWriter pwInput = new PrintWriter(file);

        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        for (int i = 0; i < alphabet.length; i++) {
            pwInput.println(alphabet[i]);
        }

        pwInput.close();
    }

}
