package com.company;


import java.util.Arrays;
import java.util.List;
import static java.lang.Integer.MIN_VALUE;

public class Main {


    public static void main(String[] args) {
	
	//Zadanie A
        List<Integer> numbers = Arrays.asList(100, -2, -3, -4, 5, 6);
        int r = numbers
                .stream()
                .reduce(0, (subtotal, element) -> subtotal + element);
        System.out.println(r);

	//Zadanie B
	r = numbers
                .stream()
                .reduce(MIN_VALUE, (submax, element) -> element>submax ? element : submax);
        System.out.println(r);



	//Zadanie C
        List<String> names = Arrays.asList("Ala","Basia","Czarek", "Darek");
        String  r = names
                .stream()
                .reduce("", (subtotal, element) -> subtotal +" "+ element);
        System.out.println(r);



    }
}
