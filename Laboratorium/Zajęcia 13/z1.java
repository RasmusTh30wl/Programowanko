package com.company;

import java.util.ArrayList;
import java.util.List;

class IntList{
    private List<Integer> lista = new ArrayList<Integer>();
    public void add(Integer number){
        lista.add(number);
    }
    public double average(){
         return  (double)lista.stream()
                .reduce(0, (subtotal, element) -> subtotal + element)/lista.size();
    }


}
public class Main {
    public static void main(String[] args) {
        IntList ob=new IntList();
        ob.add(2);
        ob.add(2);
        ob.add(3);
        ob.add(4);
        ob.add(5);
        System.out.println(ob.average());
    }
}