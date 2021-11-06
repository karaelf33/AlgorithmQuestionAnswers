package com.example.algoritma.algorithmAnswers;

import java.util.ArrayList;
import java.util.List;

public class BranchSums {

    public static List<Integer> branchSums(BinaryTree tree) {


        return new ArrayList<>();
    }

    public static void sumsBinaryTree(BinaryTree tree,List<Integer> list,int counter){
        List<Integer> treeList=new ArrayList<>();
        treeList.add(tree.value);
      /*  if (tree.left =null){

        }*/
    }


    static class BinaryTree {
        public int value;
        public BinaryTree left;
        public BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(1);
        tree.left = new BinaryTree(2);
        tree.left.left = new BinaryTree(4);
        tree.left.left.left = new BinaryTree(8);
        tree.left.right = new BinaryTree(5);
        tree.left.right.left = new BinaryTree(10);
        tree.left.left.right = new BinaryTree(9);
        tree.right = new BinaryTree(3);
        tree.right.left = new BinaryTree(6);
        tree.right.right = new BinaryTree(7);

    }
}
