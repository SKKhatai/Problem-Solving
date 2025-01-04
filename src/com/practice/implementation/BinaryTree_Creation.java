package com.practice.implementation;

import java.util.Scanner;

class Node{
        int data;
        Node right;
        Node left;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
}

public class BinaryTree_Creation{
    //Creation of a binary tree
     static Node create(){
         Scanner sc = new Scanner(System.in);
         int data=sc.nextInt();
         Node root= null;
         if(data==-1){
             return null;
         }
         root= new Node(data);
         System.out.println("Enter the left child of "+root.data);
         root.left=create();
         System.out.println("Enter the right child of "+root.data);
         root.right=create();
         return root;
     }
     //Traversal of a binary tree
    // 1.Inorder Traversal
     static void inOrder(Node root)//Left-Root-Right
     {
         if(root==null){
             return;
         }
      inOrder(root.left);
         System.out.print(root.data+" ");
         inOrder(root.right);
     }
     //PreOrder Traversal
    static void preOrder(Node root)//Root-left-right
    {
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    //PostOrder Traversal
    static void postOrder(Node root)//Left-Root-Right
    {
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
    //Find Out the size /No. of Nodes present in a binary tree
    static int findSize(Node root){
         if(root==null){
             return 0;
         }
         int leftcount=findSize(root.left);
         int rightcount=findSize(root.right);
         return leftcount+rightcount+1;

    }
    //Find the Sum Of all Nodes of a binary tree
    static int sumOfNode(Node root){
         if(root==null){
             return 0;
         }
         int leftSum=sumOfNode(root.left);
         int rightSum=sumOfNode(root.right);
         return leftSum+rightSum+root.data;
    }
     public static void main(String[] args) {
        Node root=create();
//         System.out.println("After InOrder Traversal");
//        inOrder(root);
//         System.out.println("After PreOrder Traversal");
//         preOrder(root);
//         System.out.println("After PostOrder Traversal");
//         postOrder(root);
         int ans=findSize(root);
         System.out.println("Size of the tree is "+ans);
         int res=sumOfNode(root);
         System.out.println("The sum of all the nodes is "+res );

     }
}

