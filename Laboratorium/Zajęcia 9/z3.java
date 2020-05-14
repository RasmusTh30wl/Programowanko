package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    @Override
    public String toString() {
        return "Pearson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}

public class Main {
    //zadanie 3A
    public static void printList(List<Person> list, Consumer<Person> consumer) {
        for (Person p : list) {
            consumer.accept(p);
        }
    }

    public static List<Person> adult(List<Person> lista){
        Predicate<Person> agePredicate = e1->(e1.getAge()>=18);
        List<Person> res=lista
                .stream()
                .filter(agePredicate)
                .collect(Collectors.toList());
        return res;
    }
    public static List<Person> startsWith(List<Person> lista, char begin){
        Predicate<Person> namePredicate = e1->(e1.getName().startsWith(String.valueOf(begin).toUpperCase()));
        List<Person> res=lista
                .stream()
                .filter(namePredicate)
                .collect(Collectors.toList());
        return res;
    }
    public static List<Person> notStartsWith(List<Person> lista, char begin){
        Predicate<Person> namePredicate = e1->(e1.getName().startsWith(String.valueOf(begin).toUpperCase()));
        List<Person> res=lista
                .stream()
                .filter(namePredicate.negate())
                .collect(Collectors.toList());
        return res;
    }
    public static List<Person> filterNames(List<Person> lista, char begin){
        Predicate<Person> agePredicate = e1->(e1.getAge()>=18);
        Predicate<Person> namePredicate = e1->(e1.getName().startsWith(String.valueOf(begin).toUpperCase()));
        List<Person> res=lista
                .stream()
                .filter(namePredicate.and(agePredicate))
                .collect(Collectors.toList());
        return res;
    }
    public static List<Person> sort(List<Person> lista){
        Comparator<Person> comp = (p1, p2) -> {if(p1.getAge()< p2.getAge()){
            return -1;
        } else if(p1.getAge() == p2.getAge()) {
            if(p1.getName().compareTo(p2.getName())>0){
                return 1;
            }else if(p1.getName().compareTo(p2.getName())==0){
                return 0;
            }else{
                return -1;
            }
        } else {
            return 1;
        }
        };

        List<Person> res=lista
                .stream()
                .sorted(comp)
                .collect(Collectors.toList());
        return res;
    }

    public static Person youngest(List<Person> lista){
        Person min = lista
                .stream()
                .min(Comparator.comparing(Person::getAge))
                .orElseThrow(NoSuchElementException::new);
        return min;
    }




    public static void main(String[] args) {
        List<Person> lista = new ArrayList();
        lista.add(new Person("Alicja", 8));
        lista.add(new Person("Jan", 32));
        lista.add(new Person("Barbara", 32));
        lista.add(new Person("Katarzyna", 16));
        lista.add(new Person("Agnieszka", 16));
        lista.add(new Person("Stefan", 4));
        lista.add(new Person("Aleksandra", 32));
        lista.add(new Person("Ambroży", 64));
        lista.add(new Person("Władysław", 64));

        System.out.println("zadanie 3B");
        List<Person> res = adult(lista);
        printList(res, p -> System.out.println(p));
        System.out.println("zadanie 3C");
        res = startsWith(lista,'a');
        printList(res, p -> System.out.println(p));
        System.out.println("zadanie 3D");
        res = notStartsWith(lista,'a');
        printList(res, p -> System.out.println(p));
        System.out.println("zadanie 3E");
        res = filterNames(lista,'a');
        printList(res, p -> System.out.println(p));
        System.out.println("zadanie 3F");
        res = sort(lista);
        printList(res, p -> System.out.println(p));
        System.out.println("zadanie 3G");
        Person p = youngest(lista);
        System.out.println(p.toString());

    }
}
