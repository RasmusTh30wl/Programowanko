package com.company;
import java.io.*;


public class Main {


    public static void main(String[] args)  {
        File folder = new File("C:/Users/student");
        File[] listOfFiles = folder.listFiles();

        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
                System.out.println("Plik: " + listOfFiles[i].getName());
            } else if (listOfFiles[i].isDirectory()) {
                System.out.println("Katalog: " + listOfFiles[i].getName());
            }
        }
    }
}
