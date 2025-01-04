package com.practice.problem;

import java.util.Scanner;

public class MergeSort {
   static Scanner sc =null;
    public static void main(String[] args) {
        sc=new Scanner(System.in);
        int length=sc.nextInt();
        int arr[]= new int[length];
        createArr(arr);
        printArr(arr);
    }
    public static void createArr(int[] arr){
            sc=new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
    }
    static void printArr(int arr[]){
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
}
