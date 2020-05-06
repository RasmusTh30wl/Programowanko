package com.company;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> lista=new ArrayList<>();
        lista.add("Kasia");
        lista.add("Basia");
        lista.add("Asia");
        lista.add("Stasia");
        lista.add("Joasia");


        for(String s:lista){
            System.out.println(s);
        }

        System.out.println("------------");
        Collections.sort(lista);
        for(String s:lista){
            System.out.println(s);
        }


    }
}
