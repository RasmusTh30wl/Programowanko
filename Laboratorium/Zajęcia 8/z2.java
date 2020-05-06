package com.company;



class Stats<T extends Comparable<T>>{
    private T [] values;

    public Stats(T[] values){
        this.values=values.clone();
    }

    public T min(){
        T min=values[0];
        for(T i: values){
            if(min.compareTo(i)>0)
                min=i;
        }
        return min;
    }
    public T max(){
        T min=values[0];
        for(T i: values){
            if(min.compareTo(i)<0)
                min=i;
        }
        return min;
    }
    public void sort(){
        T temp;
        for (int i = 0; i < values.length - 1; i++){
            for (int j = 0; j < values.length - 1; j++){
                if(values[j].compareTo(values[j + 1])>0){
                    temp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = temp;
                }
            }
        }
    }
    public void print(){
        for(T i: values){
            System.out.print(i+" ");
        }
        System.out.println("");
    }


}
public class Main {

    public static void main(String[] args) {
        Integer[] arr={1,2,3,4,5,0};

        Stats<Integer> st=new Stats<>(arr);
        st.print();
        st.sort();
        st.print();
        System.out.println("min="+st.min()+"\nmax="+st.max());

    }
}
