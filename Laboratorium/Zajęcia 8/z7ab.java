package com.company;


import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


public class Main {
    public static String all(ListIterator<String > begin){
        String text = new String();
        while(begin.hasNext()){
            Object tmp=begin.next();
            text+= tmp.toString() +" ";
        }
        return text;
    }
    public static double average(ListIterator<Integer> begin){
        Integer avg=new Integer(0);
        int count=0;
        while(begin.hasNext()){
            Object tmp=begin.next();
            avg+= Integer.valueOf(tmp.toString());
            count++;
        }
        return avg/count;
    }

    public static void main(String[] args) {
        List<String > lista=new ArrayList<>();
        lista.add("Kasia");
        lista.add("Basia");
        lista.add("Asia");
        lista.add("Stasia");
        lista.add("Joasia");
        System.out.println(all(lista.listIterator()));

        List<Integer> lista2=new ArrayList<>();
        lista2.add(1);
        lista2.add(12);
        lista2.add(123);
        lista2.add(1234);
        lista2.add(12345);
        System.out.println(average(lista2.listIterator()));




    }
}
