package com.company;

import java.io.FileReader;

public class CharsFileReader {

    public static void main(String[] args) throws Exception {

        FileReader file = new FileReader("C:/Users/Usuario/Desktop/alphabeta5465.txt");

        int letra = file.read();

        while (letra != -1) {
            System.out.println((char) letra);
            letra = file.read();
        }

    }

}
