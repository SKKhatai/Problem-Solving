package com.practice.problem;

public class Rotate90D2DArray {
    public static void main(String[] args) {
        int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Original Array");
        printArr(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        for(int i=0;i<arr.length;i++){
            ReverseArray(arr[i]);
        }
        System.out.println("Updated Array");
        printArr(arr);
    }
    public static void printArr(int[][] arr){
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void ReverseArray(int arr[]){
            for(int i=0;i<arr.length;i++){
                int temp=arr[0];
                arr[0]=arr[arr.length-1];
                arr[arr.length-1]=temp;
            }

    }

}
