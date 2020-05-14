package com.company;



class Stats<T extends Number>{
    private T [] values;

    public Stats(T[] values){
        this.values=values.clone();
    }
    public void set(int i, T el){
        this.values[i]=el;
    }

    public double avg(){
        double sum=0;
        for(T i: values)
            sum+=i.doubleValue();
        return sum/values.length;
    }


}
public class Main {

    public static void main(String[] args) {
        Integer [] arr={1,2,3,4,-5,6};
        Stats<Integer> st=new Stats(arr);
        System.out.println("avg="+st.avg());
        st.set(0,100);
        System.out.println("avg="+st.avg());


    }
}
