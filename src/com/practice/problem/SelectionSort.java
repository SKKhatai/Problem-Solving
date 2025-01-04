package com.practice.problem;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]= new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        selectionSort(arr);
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
    static int[] selectionSort(int []arr){

        int min=0;
        for (int i = 0; i < arr.length; i++) {
             min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            if(min!=i){
                int temp=arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
            }

        }
        return arr;
    }
}
