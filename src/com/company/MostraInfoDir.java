package com.company;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MostraInfoDir {

    public static void main(String[] args) {

        System.out.print("Escriu el path:");

        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        System.out.println("ivan@ubuntu:~$ ls");

        File f = new File(path);

        File[] files = f.listFiles();
        String[] filenames = f.list();



        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        System.out.println();
        System.out.println("exec/read/write/isfolder/size/     lastmodified     /name");
        for (int i = 0; i < files.length; i++) {



            System.out.print(files[i].canExecute() + " " + files[i].canRead() + " " + files[i].canWrite() + " " + files[i].isDirectory() + "     " + files[i].length() + " " + date.format(files[i].lastModified()) + " ");
            System.out.println(filenames[i]);



        }



    }
}
