package com.practice.DSA;

import java.util.ArrayList;

public class ReversingAnArrayList {
    public static void main(String[] args) {
        ReversingAnArrayList list=new ReversingAnArrayList();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        list.printArrayList(arr);
        arr=list.reverseArrayList(arr);
        list.printArrayList(arr);

    }
    public ArrayList<Integer> reverseArrayList(ArrayList<Integer> arr){
        int start=0;
        int end=arr.size()-1;
        while(start<end){
            int temp=arr.get(start);
            arr.set(start,arr.get(end));
            arr.set(end,temp);
            start++;
            end--;
        }
        return arr;
    }
    public void printArrayList(ArrayList<Integer> arr){
        for(Integer val:arr){
            System.out.print(val+" ");
        }
    }
}
