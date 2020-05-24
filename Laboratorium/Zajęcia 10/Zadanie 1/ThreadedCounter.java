package pl.umcs;

import java.util.Arrays;
import java.util.List;
import java.util.LinkedList;

public class ThreadedCounter extends Thread {
    Integer arrayPart[];
    Integer result = 0;

    public ThreadedCounter(Integer arrayPart[]) {
        this.arrayPart = arrayPart;
    }

    @Override
    public void run() {
        for(Integer i : arrayPart)
            result += i;
    }

    public static Integer calculateSum(Integer array[], Integer cores) throws InterruptedException {
        Integer sum = 0;
        List<ThreadedCounter> counters = new LinkedList<ThreadedCounter>();
        for(Integer i=0; i<cores; ++i) {
            ThreadedCounter counter = new ThreadedCounter(Arrays.copyOfRange(array, i * array.length / cores, (i + 1) * array.length / cores));
            counter.run();
            counters.add(counter);
        }

        for(ThreadedCounter counter : counters) {
            counter.join();
            sum += counter.result;
        }

        array[0] = 1337;

        return sum;
    }
}
