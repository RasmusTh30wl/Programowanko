package com.company;


import java.util.*;
import java.util.stream.Collectors;

class Phonebook {
    private Map<String, Integer> contacts = new TreeMap<>();
    public Phonebook() { }

    public void print() {
        for (String key : contacts.keySet()) {
            System.out.println(key + " " + contacts.get(key));
        }
    }

    public void add(String name, Integer number) {
        contacts.put(name, number);
    }

    public void delete(String name) {
        contacts.remove(name);
    }

    public void startsWith(int number) {
        contacts.entrySet()
                .stream()
                .filter(e -> e.getValue().toString().startsWith(String.valueOf(number)))
                .forEach(System.out::println);
    }

    public void contains(String word) {
        contacts.entrySet()
                .stream()
                .filter(e -> e.getKey().contains(word))
                .forEach(System.out::println);
    }

    public List<Number> numbersToList() {
        List<Number> result = contacts.entrySet().stream()
                .map(Map.Entry::getValue)
                .collect(Collectors.toList());
        return result;
    }
    public void addPrefix(int number) {
        contacts.entrySet()
                .stream()
                .filter(e -> e.getValue().toString().length()==7)
                .forEach(e -> e.setValue(Integer.valueOf(String.valueOf(number)
                               .concat(e.getValue().toString()))));

    }
}

public class Main {


    public static void main(String[] args) {
        Phonebook pb=new Phonebook();
        pb.add("Ala Makota", 510410410);
        pb.add("Ala Mapsa", 510410014);
        pb.add("Basia Nowak", 602410410);
        pb.add("Kasia Mickiewicz", 99932410);
        pb.add("Kasia Mickiewicz", 5577888);
        System.out.println("Zadanie A");
        pb.startsWith(6);

        System.out.println("Zadanie B");
        pb.contains("Ala");

        System.out.println("Zadanie C");
        List<Number> result=pb.numbersToList();
        result.forEach(System.out::println);

        System.out.println("Zadanie D");
        pb.addPrefix(82);
        pb.print();





    }
}
