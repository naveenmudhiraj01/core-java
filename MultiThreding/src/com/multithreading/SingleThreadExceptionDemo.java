package com.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
//class SingleThreadExceptionDemo {
//  public static void main(String[] args) {
//      System.out.println("Start small. Ship something.");
//      ExecutorService service=Executors.newSingleThreadExecutor();
//      
//      service.submit(()->{
//          for(int i=30;i<35;i++){
//              System.out.println("Task 3  :"+i);
//          }
//      });
//       service.submit(()->{
//          for(int i=1;i<5;i++){
//              System.out.println("Task 1  :"+i);
//          }
//      });
//       service.submit(()->{
//          for(int i=1;i<5;i++){
//              System.out.println("Task 2  :"+i);
//          }
//      });
//      service.shutdown();
//      
//      
//  }
//}
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExceptionDemo implements Runnable {

    static int availableSeats = 5;

    String userName;
    int seatsWanted;

    // Constructor
    SingleThreadExceptionDemo(String userName, int seatsWanted) {
        this.userName = userName;
        this.seatsWanted = seatsWanted;
    }

    // Booking logic
    public synchronized void bookTicket() {

        System.out.println(Thread.currentThread().getName());

        System.out.println(userName +
                " trying to book " +
                seatsWanted + " seat(s)");

        if (availableSeats >= seatsWanted) {

            System.out.println("Booking successful for "
                    + userName);

            availableSeats =
                    availableSeats - seatsWanted;

            System.out.println(seatsWanted +
                    " seat(s) booked");

            System.out.println("Remaining seats : "
                    + availableSeats);

        } else {

            System.out.println("Sorry " + userName +
                    ", seats not available");
        }

        System.out.println("--------------------------------");
    }

    @Override
    public void run() {
        bookTicket();
    }

    public static void main(String[] args) {

        ExecutorService service =
                Executors.newSingleThreadExecutor();

        service.execute(
                new SingleThreadExceptionDemo("Rahul", 2));

        service.execute(
                new SingleThreadExceptionDemo("Anjali", 1));

        service.execute(
                new SingleThreadExceptionDemo("Vikram", 3));

        service.execute(
                new SingleThreadExceptionDemo("Sneha", 1));

        service.shutdown();
    }
}
