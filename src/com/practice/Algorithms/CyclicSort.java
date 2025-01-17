package com.practice.Algorithms;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int arr[]={0,4,1,5,2,3};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclicSort(int []arr){
        int i=0;
        while (i< arr.length){
            int correct=arr[i];
            if (arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else {
                i++;
            }
        }
    }
    static void swap(int arr[],int f, int s){
        int temp=arr[f];
        arr[f]=arr[s];
        arr[s]=temp;
    }
}
