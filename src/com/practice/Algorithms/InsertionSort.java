package com.practice.Algorithms;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]= new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        insertionSort(arr);
        printArray(arr);
    }
    static void printArray(int arr[]){
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
    static int[] insertionSort(int arr[]){
        for (int i = 1; i<arr.length; i++) {
            int key=arr[i];
            int j=i-1;
            while(j>=0&&arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        return arr;
    }
}
