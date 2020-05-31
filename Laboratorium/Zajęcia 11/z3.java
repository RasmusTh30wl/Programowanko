package com.company;


import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


class Product{


    private String name;
    private float value;

    public void setValue(float amount) {
        this.value = value;
    }

    private int amount;
    public Product(String name, float value, int amount){
        this.name=name;
        this.value=value;
        this.amount=amount;
    }
    public String getName() {
        return name;
    }

    public float getValue() {
        return value;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", value=" + value +
                ", amount=" + amount +
                '}';
    }
}

public class Main {
    //Zadanie A
    public static List<Product> toBuy(LinkedList<Product> products, int amount) {
        Predicate<Product> predicate = new Predicate<Product>() {
            @Override
            public boolean test(Product p)
            {
                return p.getAmount()<amount;
            }
        };
        return products.stream().filter(predicate).collect(Collectors.toList());
    }
    //Zadanie B
    public static float value(LinkedList<Product> products) {
        return (float) products.stream().mapToDouble(e -> (e.getValue() * e.getAmount())).sum();
    }
    //Zadanie C
    public static void write(LinkedList<Product> products, String path) {
        try (PrintWriter pw = new PrintWriter(Files.newBufferedWriter(
                Paths.get(path)))) {
            products.stream().forEach(e -> pw.println(e.toString()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }





    public static void main(String[] args)  {
        LinkedList products = new LinkedList<Product>();
        Product p=new Product("ser",25.99f,6);
        products.add(p);

        products.add(new Product("masło", 5.99f,10));
        products.add(new Product("mleko", 2.59f,20));
        products.add(new Product("chleb", 3.99f,50));
        products.add(new Product("woda", 2.99f,100));
        products.add(new Product("szynka", 19.99f,5));


        List<Product> products1 = toBuy(products,21);
        products1.forEach(System.out::println);
        System.out.println("Wartość: "+value(products));

        write(products,"produkty.txt");



    }
}
