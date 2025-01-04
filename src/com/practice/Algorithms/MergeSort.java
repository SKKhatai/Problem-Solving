package com.practice.Algorithms;

import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length=sc.nextInt();
        int arr[]= new int[length];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        devideArray(arr,0,arr.length-1);
        printArray(arr);
    }
    static void printArray(int[] arr){
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
    static void devideArray(int[] arr,int start,int end){
        if(start<end){
            int mid=(start+end)/2;
            devideArray(arr,start,mid);
            devideArray(arr,mid+1,end);
            mergeArray(arr,start,mid,end);
        }
    }
    static void mergeArray(int []arr,int start,int mid,int end){
            int subarr1[]= new int[(mid-start)+1];
            int subarr2[]= new int[end-mid];
            int arrindex=start;

        for (int i = 0; i < subarr1.length; i++) {
            subarr1[i]=arr[arrindex];
            arrindex++;
        }
        for (int i = 0; i < subarr2.length; i++) {
            subarr2[i]=arr[arrindex];
            arrindex++;
        }

        int a=0;
        int b=0;
        int c=start;

        while(a<subarr1.length&&b<subarr2.length){
            if(subarr1[a]<subarr2[b]){
                arr[c]=subarr1[a];
                a++;
                c++;
            }
            else{
                arr[c]=subarr2[b];
                b++;
                c++;
            }
        }
        while(a<subarr1.length){
            arr[c]=subarr1[a];
            c++;
            a++;
        }
        while(b<subarr2.length){
            arr[c]=subarr2[b];
            c++;
            b++;
        }

    }
}
