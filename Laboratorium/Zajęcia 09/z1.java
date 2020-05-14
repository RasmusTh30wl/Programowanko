package com.company;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void replace(List<Integer> lista, int begin, int end){
        lista.replaceAll(n -> (n < begin || n > end) ? 0 : n);
    }

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList();
        lista.add(15);
        lista.add(16);
        lista.add(11);
        lista.add(20);

        replace(lista,12,18);
        lista.forEach(System.out::println);
    }
}
