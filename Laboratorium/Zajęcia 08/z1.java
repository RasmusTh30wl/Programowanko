package com.company;
class Number<T>{
    private T value;

    public Number(T value){
        this.value=value;
    }

    public T getValue() {
        return value;
    }

    public void set(T i){
        value=i;
    }
    public void print(){
        System.out.println(value);
    }
}
public class Main {

    public static void main(String[] args) {
        Number<Integer> n=new Number<>(4);
        Number<Float> m=new Number<>(5.6f);
        System.out.println(n.getValue().getClass());
        System.out.println(m.getValue().getClass());

    }
}
