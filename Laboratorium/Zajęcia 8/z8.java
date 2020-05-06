package com.company;


import java.util.*;


public class Main {
    public static Set<Integer> all(List<Integer> l1, List<Integer> l2){
        Set<Integer> res=new TreeSet<>();
        for(Integer i:l1)
            res.add(i);
        for(Integer i:l2)
            res.add(i);
        return res;

    }


    public static void main(String[] args) {
        List<Integer > lista=new ArrayList<>();
        lista.add(1);
        lista.add(13);
        lista.add(1234);
        lista.add(123);
        lista.add(12345);

        List<Integer> lista2=new ArrayList<>();
        lista2.add(1);
        lista2.add(12);
        lista2.add(123);
        lista2.add(1234);
        lista2.add(12345);
        Set<Integer> res=all(lista, lista2);
        for(Integer i:res)
            System.out.println(i);




    }
}
