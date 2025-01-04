package com.practice.Algorithms;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        sortSelection(arr);
        printArray(arr);
    }
    static void printArray(int[] arr){
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
    static int[] sortSelection(int[] arr){
         boolean flag=true;
        for (int i = 0; i < arr.length; i++) {
                int min=i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<arr[min]){
                    min=j;

                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        return arr;
    }

}
