package com.example.algoritma.algorithmAnswers;

public class FindParent2 {

    static class Node
    {
        String data;
        Node leftNode, rightNode;
        Node(String data)
        {
            this.data = data;
            leftNode = rightNode = null;
        }

    }
        public static boolean printAncestors(Node root, Node node)
        {
            if (root == null) {
                return false;
            }

            if (root == node) {
                return true;
            }

            boolean left = printAncestors(root.leftNode, node);

            boolean right = false;
            if (!left) {
                right = printAncestors(root.rightNode, node);
            }

            if (left || right) {
                System.out.print(root.data + " ");
            }

            return left || right;
        }

        public static void main(String[] args)
        {

            Node root = new Node("a");
            root.leftNode = new Node("b");
            root.leftNode.leftNode = new Node("c");
            root.leftNode.leftNode.leftNode = new Node("d");
            root.leftNode.rightNode = new Node("e");
            root.leftNode.rightNode.leftNode = new Node("f");
            root.rightNode = new Node("g");
            Node node = root.leftNode.rightNode.leftNode;
            Node node2 = root.leftNode.rightNode.leftNode;

            printAncestors(root, node);
            printAncestors(root, node2);
        }




}
