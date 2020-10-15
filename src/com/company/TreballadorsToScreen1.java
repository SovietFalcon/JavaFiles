package com.company;

import java.io.File;
import java.util.Scanner;

public class TreballadorsToScreen1 {

    public static void main(String[] args) throws Exception {

        File file = new File("C:/Users/Usuario/Desktop/treballadors.txt");

        Scanner scanner = new Scanner(file).useDelimiter(",");
        int treballador = 0;

        while (scanner.hasNext()) {
            treballador++;
            System.out.println("TREBALLADOR " + treballador);
            System.out.println();
            System.out.println(scanner.next());
            System.out.println();
            System.out.println(scanner.next());
            System.out.println();
            System.out.println(scanner.next());
            System.out.println();
            System.out.println(scanner.next());
            System.out.println();


        }

    }

}
