package com.arrays;

//write this proeprly tommorrow:

import java.util.Scanner;
class UserArray {
    public static void main(String[] args) {
       int arr[][]= new int[3][3];
       Scanner sc=new Scanner(System.in);
       for(int i=0;i<3;i++){
           for(int j=0;j<3;j++){
               arr[i][j]=sc.nextInt();
               
           }
           System.out.println();
       }
       for(int i=0;i<3;i++){
           for(int j=0;j<3;j++){
               if(arr[i]==arr[j]){
                   System.out.print(arr[i]);
               }
               System.out.println();
           }
       }
    }
}