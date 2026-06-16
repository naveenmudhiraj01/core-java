package com.arrays;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ArraysUsingException {

    public static void main(String[] args) {

        // Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Array to store 5 integer values
        int arr[] = new int[5];

        // index variable
        int i = 0;

        // loop runs until array is filled
        while (i < arr.length) {

            try {

                // take input from user
                System.out.println("Enter number " + (i + 1) + " value:");

                // store input in array
                arr[i] = sc.nextInt();

                // move to next index if input is correct
                i++;

            }

            catch (InputMismatchException e) {

                // runs when user enters wrong input (like abc)
                System.out.println("Invalid input! Please enter only numbers.");
                System.out.println("Error "+e);

                // clear wrong input from scanner buffer
                sc.next();
            }
        }

        // message before printing array
        System.out.println("Stored values are:");

        // index for printing
        int j = 0;

        // loop to print array values
        while (j < arr.length) {

            System.out.print(arr[j]+" ");

            // move to next index
            j++;
        }

        // close scanner (free resources)
        sc.close();
    }
}