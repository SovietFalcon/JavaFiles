package com.company;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class TreballadorsToFile1 {

    public static void main(String[] args) throws Exception {

        File file = new File("C:/Users/Usuario/Desktop/treballadors.txt");

        String cont = "Y";
        PrintWriter pwInput = new PrintWriter(file);
        Scanner scanner = new Scanner(System.in);



        while (cont.equals("Y") || cont.equals("y")) {
            System.out.print("Nom: ");
            pwInput.print(scanner.nextLine() + ",");

            System.out.print("Cognoms: ");
            pwInput.print(scanner.nextLine() + ",");

            System.out.print("Salari: ");
            pwInput.print(scanner.nextLine() + ",");

            System.out.print("Casat (Y/N): ");
            pwInput.print(scanner.nextLine());

            System.out.println("Vols continuar?");
            cont = scanner.nextLine();

            if (cont.equals("Y") || cont.equals("y")) {
                pwInput.println(",");

            }

        }

        pwInput.close();
    }

}
