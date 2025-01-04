package com.practice.problem;

public class MissingNumberInArray {
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,7};
        int tempSum=(7*8)/2;
        int actualSum=0;
        for(int val:arr){
            actualSum=actualSum+val;
        }
        System.out.println("Missing Number is"+(tempSum-actualSum));
    }
}
