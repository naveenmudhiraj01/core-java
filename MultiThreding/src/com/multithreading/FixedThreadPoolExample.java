package com.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPoolExample {

    public static void main(String[] args) {

        ExecutorService executor =
                Executors.newFixedThreadPool(3);
        int i=1;

        for (; i <= 5; i++) {

            int task = i;

            executor.submit(() -> {

                System.out.println(
                        "Task " + task +
                        " executed by " +
                        Thread.currentThread().getName()
                );

            });
        }

        executor.shutdown();
    }
}