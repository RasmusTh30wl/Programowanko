package pl.umcs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ThreadedRandom extends Thread {
    Integer arrayPart[];
    Random generator = new Random();
    int copyStart, copyEnd;

    public ThreadedRandom(Integer arrayPart[], int copyStart, int copyEnd) {
        this.arrayPart = arrayPart;
        this.copyStart = copyStart;
        this.copyEnd = copyEnd;
    }

    @Override
    public void run() {
        for(Integer i=0; i<arrayPart.length; i++)
            arrayPart[i]= generator.nextInt(10);
    }

    public static void randomize(Integer array[], Integer cores) throws InterruptedException {
        List<ThreadedRandom> threads = new LinkedList<ThreadedRandom>();
        for(Integer i=0; i<cores; ++i) {
            int copyStart = i * array.length / cores;
            int copyEnd = (i + 1) * array.length / cores;
            ThreadedRandom randomizer = new ThreadedRandom(Arrays.copyOfRange(array, copyStart, copyEnd), copyStart, copyEnd);
            randomizer.run();
            threads.add(randomizer);
        }

        for(ThreadedRandom randomizer : threads) {
            randomizer.join();
            System.arraycopy(randomizer.arrayPart,0,array, randomizer.copyStart, randomizer.copyEnd-randomizer.copyStart);
        }
    }
}

