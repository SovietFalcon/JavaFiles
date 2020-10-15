package com.company;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class CopyDirFRFW {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qué directorio quieres copiar?");

        File dirfuente = new File(scanner.nextLine());
        File[] archivosdir = dirfuente.listFiles();

        System.out.println("A dónde quieres copiarlo?");

        File dirdestino = new File(scanner.nextLine());


        for (int i = 0; i < archivosdir.length; i++) {

            FileReader reader = new FileReader(archivosdir[i]);
            FileWriter writer = new FileWriter(dirdestino+"/"+archivosdir[i].getName());

            int texto = reader.read();

            while (texto != -1) {
                writer.write(((char) texto));
                texto = reader.read();
            }

            writer.close();
        }




    }

}
