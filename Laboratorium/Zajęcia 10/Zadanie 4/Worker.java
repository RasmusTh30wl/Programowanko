package com.umcs.oop1;

import java.util.Date;
import java.util.Random;

public class Worker extends Thread {
    long endTime = new Date().getTime() + 500;
    Random generator = new Random();
    long insideCount = 0;
    long count = 0;

    @Override
    public void run() {
        while(new Date().getTime() <= endTime) {
            float x = generator.nextFloat();
            float y = generator.nextFloat();
            count++;
            if (x * x + y * y <= 1) insideCount++;
        }
    }

    public float result() {
        return ((float)insideCount)/((float)count);
    }

    public long getCount() {
        return count;
    }

}
