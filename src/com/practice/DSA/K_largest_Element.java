package com.practice.DSA;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class K_largest_Element {
    public static void main(String[] args) {

        //Problem:We have Given An array and an Integer K . Find largest K elements
        //TestCase:array={10,1,4,7,2,13,3}; and K=3
        //OutPut:--10,7,13
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length Of the array");
        int arr[]= new int[sc.nextInt()];
        System.out.println("Enter Elements Of the array");
        insertElement(arr);
      //  printArr(arr);
        System.out.println("Enter value of K");
        int k=sc.nextInt();
       // findLargestElements(k,arr);
       // findLagestK_element(k,arr);
        PriorityQueue<Integer> que= new PriorityQueue<>(Collections.reverseOrder());
        int i=0;
        while (i<arr.length){
            que.add(arr[i]);
            i++;
        }
        int j=0;

        while(j<k){
            System.out.println(que.remove());
            j++;
        }

    }
    public static int[] insertElement(int []arr){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    static void printArr(int[] arr){
        for (int val:arr){
            System.out.println(val);
        }
    }


    //Using Priority Que With Time Complexity O(nlogk)
    public static void findLargestElements(int k,int[] arr){
        PriorityQueue<Integer> que= new PriorityQueue<Integer>();
        int i=0;
        while(i<k){
            que.add(arr[i]);
            i++;
        }
        while(i< arr.length){
            if(arr[i]>que.peek()){
                que.remove();
                que.add(arr[i]);
            }
            i++;
        }
        while(que.size()>0){
            System.out.println(que.remove());
        }
    }

    //Using Sorting Method:Time Complexity:O(nlogn)
    public static void findLagestK_element(int k,int[] arr){
        Arrays.sort(arr);
        for(int i=arr.length-k;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
