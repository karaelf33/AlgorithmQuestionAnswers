package com.example.algoritma.algorithmAnswers;

// Yusuf Beştaş
public class FindClosestValueInBST {

    public static int findClosestValueInBst(BST tree, int target) {


        return findClosestValueInBst(tree, target, tree.value);
    }

    public static int findClosestValueInBst(BST tree, int target, int closest) {
        if (Math.abs(target - closest) > Math.abs(target - tree.value)) {
            closest = tree.value;
        }
        if (target < tree.value && tree.left != null) {
            return findClosestValueInBst(tree.left, target, closest);
        } else if (target > tree.value && tree.right != null) {
            return findClosestValueInBst(tree.right, target, closest);
        } else {
            return closest;
        }
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }


    public static void main(String[] args) {
        BST tree = new BST(10);
        tree.left = new BST(5);
        tree.left.left = new BST(2);
        tree.left.left.left = new BST(1);
        tree.left.right = new BST(5);
        tree.right = new BST(15);
        tree.right.left = new BST(13);
        tree.right.left.left = new BST(12);
        tree.right.left.right = new BST(15);
        tree.right.left.right.right = new BST(16);
        tree.right.left.right.right.right = new BST(17 );
        tree.right.right = new BST(22);
        System.out.println(findClosestValueInBst(tree, 12));
        printBinaryTree(tree,0);

    }
    public static void printBinaryTree(BST root, int level){
        if(root==null)
            return;
        printBinaryTree(root.right, level+1);
        if(level!=0){
            for(int i=0;i<level-1;i++)
                System.out.print("|\t");
            System.out.println("|-------"+root.value);
        }
        else
            System.out.println(root.value);
        printBinaryTree(root.left, level+1);
    }


}
