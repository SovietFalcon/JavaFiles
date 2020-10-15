package com.company;

import java.io.File;
import java.util.Scanner;

public class TestFitxer {

    public static void main(String[] args) {
        //scanner/path
        System.out.println("Test Fitxer, información de archivos");
        System.out.println("Introduce el path:");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();


        File f = new File(path);

        if (f.exists()) {
            System.out.println("La ruta especificada existe.");

            System.out.print(f.getName());
            if (f.isFile()) {
                System.out.println(" es un fichero.");
            } else {
                System.out.println(" es un directorio.");
                System.out.println("Contiene:");

                String[] direc = f.list();

                for (int i = 0; i < direc.length; i++) {
                    System.out.println(direc[i]);
                }

                System.out.println();

            }

            System.out.println("Se encuentra en el directorio " + f.getParent() + "(padre).");

            if (f.canExecute()) {
                System.out.println("Se puede ejecutar.");
            } else {
                System.out.println("No se puede ejecutar.");
            }

            if (f.canRead()) {
                System.out.println("Se puede leer.");
            } else {
                System.out.println("No se puede leer.");
            }

            if (f.canWrite()) {
                System.out.println("Se puede editar.");
            } else {
                System.out.println("No se puede editar.");
            }

            System.out.println();
            System.out.println("Su ruta completa es " + f.getAbsolutePath());

        } else {
            System.out.println("El archivo/directorio especificado en la ruta .. " + path + " .. no existe.");
        }

    }
}
