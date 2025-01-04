package com.practice.problem;

import java.util.Scanner;

public class InternShipExpenditureProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length=sc.nextInt();
        int arr[]= new int[length];
        queue(arr,length);
        int res=0;
        for(int val:arr){
            if(val==5){
               res+=val;
            }
            else if(val==10){
                res=res-5;
                res=res+10;
            }
            else if(val==20){
            }
        }


    }
    public static void queue(int[] arr,int length){
        Scanner sc = new Scanner(System.in);
       for(int i=0;i<arr.length;i++){
           arr[i]=sc.nextInt();
       }
    }
}
