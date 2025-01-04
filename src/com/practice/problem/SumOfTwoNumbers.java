package com.practice.problem;

import java.util.HashMap;
import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target=sc.nextInt();
        int arr[]={1,2,3,4,5,6,7,8};
        findTwoSum(target,arr);
    }

    public static void findTwoSum(int target,int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
       int arr2[]= new int[2];
        for(int i=0;i<arr.length;i++){
            int check=target-arr[i];
            if(map.containsKey(check)){
                System.out.println("the two numbers are "+arr[map.get(check)]+" and "+arr[i]);
                return;
            }
            map.put(arr[i],i);
        }
    }




}

