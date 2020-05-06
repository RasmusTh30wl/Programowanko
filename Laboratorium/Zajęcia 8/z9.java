package com.company;


import java.util.*;

class Phonebook{
    private Map<String, Integer> contacts=new TreeMap<>();;
    public Phonebook(){

    }

    public void print(){
        for(String key:contacts.keySet()) {
            System.out.println(key + " " + contacts.get(key));
        }
    }
    public void add(String name, Integer number){
        contacts.put(name, number);
    }
    public void delete(String name){
        contacts.remove(name);
    }

}

public class Main {


    public static void main(String[] args) {
        Phonebook pb=new Phonebook();
        pb.add("Ala", 510410410);
        pb.add("Basia", 102410410);
        pb.add("Kasia", 99932410);
        pb.print();
        System.out.println("--------------------");
        pb.delete("Ala");
        pb.print();





    }
}
