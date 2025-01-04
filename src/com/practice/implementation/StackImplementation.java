package com.practice.implementation;

import java.util.Scanner;

public class StackImplementation {
    static  int stack[];
   static int top=-1;
    static int[] createStack(int size){
        stack= new int[size];
        top=-1;
        return stack;
    }
    void push(int data){
        if(top==stack.length-1){
            System.out.println("stack Overflow can't insert data");
        }
        else {
            top++;
            stack[top]=data;
        }

    }
    void pop(){
        if(top==-1){
            System.out.println("Stack Underflow can't Remove");
        }
        stack[top]=0;
        top--;
    }
    void display(){
        if(top==-1){
            System.out.println("stack is empty");
        }
        else{
            for (int i=top;i>=0;i--){
                System.out.println(" "+stack[i]);
            }
        }
    }
    boolean isEmpty(){
       return top==-1;
    }
    boolean isFull(){
        return top==stack.length-1;
    }
    static void insert(int data){
        if(top==stack.length-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length=sc.nextInt();
        createStack(length);
        StackImplementation stack= new StackImplementation();
        while (true){
            System.out.println("Choose Your Option");
            int option=sc.nextInt();
            switch (option){
                case 1: stack.push(sc.nextInt());
                        break;
                case 2: stack.pop();
                break;
                case 3: stack.display();
                break;
                case  4:
                    System.out.println(stack.isEmpty());
                break;
                case 5:
                    System.out.println(stack.isFull());
                break;
                case 6:System.exit(0);
                break;
                default:
                    System.out.println("You Choose Wrong Option");
            }
        }
    }
}
