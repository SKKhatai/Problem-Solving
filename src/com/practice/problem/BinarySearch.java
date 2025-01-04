package com.practice.problem;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]= new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int key=sc.nextInt();
       int res= binarySearch2(arr,key,0,arr.length-1);
        System.out.println((res==-1 ?"key is not found":"key is found at position"+res));
    }
//    static int binarySearch(int[] arr,int key){
//        int start=0;
//        int end=arr.length-1;
//        while(start<=end){
//            int mid=(start+end)/2;
//            if(arr[mid]==key){
//                return mid;
//            } else if (key<arr[mid]) {
//                end=mid-1;
//            }
//            else{
//                start=mid+1;
//            }
//        }
//        return -1;
//    }

    static int binarySearch2(int[] arr,int key,int start,int end){
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(key>arr[mid]){
                return binarySearch2(arr,key,mid+1,end);
            }
            else{
                return binarySearch2(arr,key,start,mid-1);
            }
        }
        return -1;
    }
}
