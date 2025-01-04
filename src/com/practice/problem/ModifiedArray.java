package com.practice.problem;

import java.util.Scanner;

public class ModifiedArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[]=new int[sc.nextInt()];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        modifyArray(arr);
        printArr(arr);
    }
   static void printArr(int[] arr){
       for(int val:arr){
            System.out.print(val+" ");
        }
    }
    static int[] modifyArray(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
//            int start=0;
//            while(start<pointer){
//                arr[i]=arr[start]+arr[pointer];
//                start++;
//
//            }
            sum=sum+arr[i];
            arr[i]=sum;
//            System.out.print(sum);
        }
        return arr;
    }

}
