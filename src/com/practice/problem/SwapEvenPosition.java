package com.practice.problem;

import java.util.Scanner;

public class SwapEvenPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length=sc.nextInt();
        int arr[]= new int[length];
        arr=createArray(arr);
        swapEvenpos(arr);
        displayArr(arr);

    }
    static int[] createArray(int[] arr){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        return  arr;
    }
    static int[] swapEvenpos(int[] arr){
       int start=0;
       int end=arr.length-1;
       while(start<end){
           if(start%2==0){
               int temp=arr[start];
               arr[start]=arr[end];
               arr[end]=temp;
           }
           start++;
           end--;
       }
       return arr;
    }
    static void displayArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
