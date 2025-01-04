package com.practice.problem;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]=new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        bubbleSort(arr);
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
    public static int[] bubbleSort(int[] arr){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            boolean flag=false;
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]) {
                    count++;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if(flag==false){
                break;
            }
        }
        System.out.println(count);
        return arr;
    }
}
