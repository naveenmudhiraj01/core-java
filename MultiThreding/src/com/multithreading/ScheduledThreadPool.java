package com.multithreading;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPool {

	public static void main(String[] args) {
        ScheduledExecutorService scheduler =Executors.newScheduledThreadPool(2);
        Runnable task = ()->{
        	System.out.println("task Executed After 5 seconds by "+Thread.currentThread().getName());;
        };
        scheduler.schedule(task,5 , TimeUnit.SECONDS);
        System.out.println("Wating...");
        scheduler.shutdown();
	}

}
