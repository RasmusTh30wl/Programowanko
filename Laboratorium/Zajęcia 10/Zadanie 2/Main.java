package pl.umcs;

import java.util.Random;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Random rd = new Random();
        Integer[] array = new Integer[100];
        int sequentialSum = 0;
        for (int i = 0; i < array.length; ++i) {
            array[i] = rd.nextInt(1000);
            sequentialSum += array[i];
        }
        int threadedSum = ThreadedGeneric.calculateMethod(0, array, new MaxMethod(), 10);
        System.out.println(sequentialSum);
        System.out.println(threadedSum);
    }
}
