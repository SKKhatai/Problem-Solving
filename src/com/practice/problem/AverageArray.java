package com.practice.problem;

import java.util.Scanner;

//Problem:-Find out the average of the array after removing the greater and smaller element of the array?
//TestCase:-
//10 2 4 1 12
//Average is 5
public class AverageArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr= new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int minindex=0;
        int maxindex=0;
        int sum=0;
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[maxindex]) {
                maxindex = i;
            }
            if (arr[i] < arr[minindex]) {
                // min=arr[i];
                minindex = i;
            }
        }
        arr[minindex]=0;
        arr[maxindex]=0;
        for (int i = 0; i < arr.length; i++) {
                sum=sum+arr[i];
        }
        int avg=sum/(arr.length-2);
        System.out.println("Average is "+avg);
    }
}
