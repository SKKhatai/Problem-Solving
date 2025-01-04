package com.practice.problem;

import java.util.Scanner;

public class Count3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        for (int i = 0; i < n; i++) {
            boolean res= checkNumber3(i);
            if(res==true){
                count++;
            }

        }
        System.out.println(n-count);
    }
    static boolean checkNumber3(int n){
        boolean flag=false;
        while(n>0){
            int rem=n%10;
            if(rem==3){
                flag=true;
                break;
            }
            n=n/10;
        }
        return flag;
    }
}
