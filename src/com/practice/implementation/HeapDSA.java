package com.practice.implementation;

import java.util.Collections;
import java.util.PriorityQueue;

public class HeapDSA {
    public static void main(String[] args) {
        //Priority key is also known as Heap Data Structure
//        PriorityQueue <Integer> que= new PriorityQueue<>();
//
//        //adding Element:Time complexity:-O(logn)
//
//
//        que.add(10);
//        que.add(30);
//        que.add(40);
//        que.add(50);
//        que.add(60);
//        que.add(10);
//
//        //Removing Element:Time Complexity:-O(logn)
//        System.out.println(que.remove());//10
//        System.out.println(que.remove());//30
//
//        //Peek Of the queue:Time Complexity:O(1)
//
//        System.out.println(que.peek());
//        System.out.println(que.peek());
//
//        System.out.println(que.size());


        //To change The Priority Of the Element In Reverse Order
        PriorityQueue<Integer> que2=new PriorityQueue<>(Collections.reverseOrder());


        que2.add(10);
        que2.add(30);
        que2.add(40);
        que2.add(50);
        que2.add(60);
        que2.add(10);

        //Removing Element:Time Complexity:-O(logn)
        System.out.println(que2.remove());//60
        System.out.println(que2.remove());//50

        //Peek Of the queue:Time Complexity:O(1)

        System.out.println(que2.peek());//40
        System.out.println(que2.peek());//40

        System.out.println(que2.size());//4

    }
}
