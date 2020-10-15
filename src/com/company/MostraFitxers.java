package com.company;

import java.io.File;
import java.util.Scanner;

public class MostraFitxers {


    public static void main(String[] args) {

        System.out.println("Introduce el path");

        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        File f = new File(path);

        String[] files = f.list();
        for (int i = 0; i < files.length; i++) {
            System.out.println(files[i]);
        }


    }
}
