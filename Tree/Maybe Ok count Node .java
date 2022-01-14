package com.company.TreeExam;

import java.util.LinkedList;
import java.util.Queue;

/*
        1
    2       3
 4    5   6    7

 1 2 4
 1 2 3 remove 7.
 */
public class Main {
    static Node root;
    public static void main(String[] args) {
        Main tree = new Main();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right= new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right= new Node(5);
        tree.root.right.left= new Node(6);
        tree.root.right.right= new Node(7);
        System.out.println(display(root));
    }
    public static int display(Node root){
        Queue<Node> que = new LinkedList<>();
        que.add(root);
        int count=0;
        while(!que.isEmpty()){
//            System.out.print(count+" ");
            int size = que.size();
            while(size -- >0){
                Node curr = que.poll();
                if(curr.left!=null && curr.right!=null){
                    count++;
                }
                if(curr.left!=null){
                    que.add(curr.left);
                }
                if(curr.right!=null){
                    que.add(curr.right);
                }
            }
//            System.out.println();
        }
        return count;
    }
}
