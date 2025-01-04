package com.practice.DSA;

import com.practice.implementation.HashMap_Practice;

import java.util.HashMap;

public class CommonElements_Arr {
    public static void main(String[] args) {
        int arr[]={5,8,9,6,3,2};
        int arr2[]={9,7,1,5,2,14,10};

        //output:--Common Elements are 9,5,2
        check_CommonElement(arr,arr2);

    }
    public static void check_CommonElement(int[] arr1,int[] arr2){
        HashMap<Integer,Integer> map= new HashMap<>();
      for(int i=0;i<arr1.length;i++){
          map.put(arr1[i],1);
      }

       for(int i=0;i<arr2.length;i++){
           int a=arr2[i];
           if(map.containsKey(a)){
               System.out.println(a);
           }
       }

    }
}
