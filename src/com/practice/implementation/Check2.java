package com.practice.implementation;

interface Check{
    public void main(String args[]);
}



class Test implements Check {
    public void main(String args[]){
        System.out.println("Hey this is main method");
    }
}

public class Check2{
    public static void main(String[] args) {
        Test t = new Test();
        String arr[]= new String[5];
        t.main(arr);
    }
}

