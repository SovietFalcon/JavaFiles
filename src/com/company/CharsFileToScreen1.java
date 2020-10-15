package com.company;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class CharsFileToScreen1 {

    public static void main(String[] args) throws Exception {

        File file = new File("C:/Users/Usuario/Desktop/alphabeta.txt");

        Scanner scanner = new Scanner(file);

        while (scanner.hasNext()) {
            System.out.print(scanner.nextLine().toUpperCase() + " ");
        }

    }

}
