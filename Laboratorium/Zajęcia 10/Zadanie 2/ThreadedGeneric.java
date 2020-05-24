package pl.umcs;

import java.util.Arrays;
import java.util.List;
import java.util.LinkedList;

public class ThreadedGeneric<T> extends Thread {
    T arrayPart[];
    T result;
    GenericMethod<T> genericMethod;

    public ThreadedGeneric(T neutral, T arrayPart[], GenericMethod<T> genericMethod) {
        result = neutral;
        this.arrayPart = arrayPart;
        this.genericMethod = genericMethod;
    }

    private T getResult() {
        return this.result;
    }

    @Override
    public void run() {
        for(T i : arrayPart) {
            result = genericMethod.function(result, i);
        }
    }


    public static <T> T calculateMethod(T neutral, T array[], GenericMethod<T> genericMethod, int cores) throws InterruptedException {
        T result = neutral;
        List<ThreadedGeneric> counters = new LinkedList<ThreadedGeneric>();
        for(int i=0; i<cores; ++i) {
            ThreadedGeneric counter = new ThreadedGeneric(neutral, Arrays.copyOfRange(array, i * array.length / cores, (i + 1) * array.length / cores),genericMethod);
            counter.run();
            counters.add(counter);
        }

        for(ThreadedGeneric counter : counters) {
            counter.join();
            result = genericMethod.function(result, (T) counter.getResult());
        }

        return result;
    }
}
