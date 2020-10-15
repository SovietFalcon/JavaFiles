package com.company;

import java.io.File;
import java.util.Scanner;

public class CreaDir {

    public static void main(String[] args) {

        //ivan campos
        System.out.println("Introduce el path para crear:");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        File f = new File (path);

        if (f.exists()) {
            System.out.println("El directorio ya existe.");
        } else {

            f.mkdirs();

            if (f.exists()) {
                System.out.println(f.getName() + " creado correctamente en la ruta especificada:");
                System.out.println(f.getAbsolutePath());
            } else {
                System.out.println("El directorio especificado no se ha podido crear.");
            }
        }

    }

}
