package com.example.algoritma.algorithmAnswers;

public class NodePath {



    static class Tree {
        public String value;
        public Tree leftNode;
        public Tree rightNode;

        public Tree(String value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        Tree root = new Tree("a");
        root.leftNode = new Tree("b");
        root.leftNode.leftNode = new Tree("c");
        root.leftNode.rightNode = new Tree("e");
        root.leftNode.rightNode.leftNode = new Tree("f");
        root.rightNode = new Tree("g");

        printBinaryTree(root, 0);
    }

    public static void printBinaryTree(Tree root, int level) {
        if (root == null)
            return;
        printBinaryTree(root.rightNode, level + 1);
        if (level != 0) {
            for (int i = 0; i < level - 1; i++)
                System.out.print("|\t");
            System.out.println("|-------" + root.value);
        } else
            System.out.println(root.value);
        printBinaryTree(root.leftNode, level + 1);
    }
}
