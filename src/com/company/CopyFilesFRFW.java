package com.company;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class CopyFilesFRFW {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qué fichero de texto quieres copiar?");

        FileReader reader = new FileReader(scanner.nextLine());

        System.out.println("A dónde quieres copiarlo?");

        FileWriter writer = new FileWriter(scanner.nextLine());

        int texto = reader.read();

        while (texto != -1) {
            
            writer.write((char) texto);
            texto = reader.read();

        }

        writer.close();




    }

}
