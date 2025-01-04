package com.practice.problem;

import java.util.Scanner;

public class BracketBalancing {
    static char stack[];
    static int top=-1;
    static void push(char ch) {
        if (top != stack.length - 1) {
            top++;
            stack[top] = ch;
        }
    }
    static void pop(){
        if(top!=-1){
            stack[top]=0;
            top--;
        }
    }
        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            stack=new char[s.length()];

            //char ch[]=s.toCharArray();
            boolean flag=true;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(') {
                    push('(');
                }
                else if(s.charAt(i)==')'&&top!=-1){
                    pop();
                }
                else{
                    flag=false;
                    break;
                }

            }
            System.out.println(flag==true&&top==-1?"Balanced Bracket":"BracketNotBalanced");
        }
    }