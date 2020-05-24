package com.umcs.oop1;

public class Main {

    public static float estimatePi(boolean threaded) throws InterruptedException {
        float result = 0;
        if(threaded) {
            int threadCount = Runtime.getRuntime().availableProcessors();
            long weightSum = 0;
            Worker workers[] = new Worker[threadCount];
            for(int i=0; i<threadCount; i++) {
                workers[i] = new Worker();
                workers[i].start();
            }
            for(Worker worker : workers) {
                worker.join();
                weightSum += worker.getCount();
            }
            for(Worker worker : workers) {
                result += worker.result()*worker.getCount()/weightSum;
            }
        }
        else {
            Worker worker = new Worker();
            worker.run();
            result = worker.result();
        }
        return result*4.f;

    }

    public static void main(String[] args) {
        try {
            System.out.println(estimatePi(false));
            System.out.println(estimatePi(true));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
