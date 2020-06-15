package com.company;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static <T extends Number> void addToEveryElement(List<T> lista, T value){
        if(value.getClass()==Double.class)
            for(int i=0;i<lista.size();i++) {
                T tmp = (T) Double.valueOf(lista.get(i).doubleValue() + value.doubleValue());
                lista.set(i, tmp);
            }
        if(value.getClass()==Integer.class)
            for(int i=0;i<lista.size();i++) {
                T tmp= (T) Double.valueOf(lista.get(i).intValue()+value.intValue());
                lista.set(i,tmp);
            }
        if(value.getClass()==Long.class)
            for(int i=0;i<lista.size();i++) {
                T tmp= (T) Long.valueOf(lista.get(i).longValue()+value.longValue());
                lista.set(i,tmp);
            }
     }
     //specjalizacja dla String
    public static void addToEveryElement(List<String> lista, String value){
            for(int i=0;i<lista.size();i++) {
                String s=lista.get(i)+value;
                lista.set(i,s );
            }
    }


    public static void main(String[] args) {
        List<Double> lista=new ArrayList<Double>();
        lista.add(23.2);
        lista.add(24.2);
        lista.add(25.2);
        addToEveryElement(lista,1.0);
        for(Double a:lista)
            System.out.println(a);
        List<String> lista2=new ArrayList<String>();
        lista2.add("Alicja");
        lista2.add("Jan");
        lista2.add("Stefan");
        addToEveryElement(lista2," Nowak");
        for(String a:lista2)
            System.out.println(a);
    }
}
