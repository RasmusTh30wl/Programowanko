package pl.umcs;

import java.util.Random;

public class Main {

    public static void main(String[] args) throws InterruptedException {
//        Random rd = new Random();
        Integer[] array = new Integer[100];
        int sequentialSum = 0;
        ThreadedRandom.randomize(array, 10);

        for (int i = 0; i < array.length; ++i) {
//            array[i] = rd.nextInt(10);
            sequentialSum += array[i];
        }


        int threadedSum = ThreadedCounter.calculateSum(array,10);
        System.out.println(sequentialSum);
        System.out.println(threadedSum);
    }
}
