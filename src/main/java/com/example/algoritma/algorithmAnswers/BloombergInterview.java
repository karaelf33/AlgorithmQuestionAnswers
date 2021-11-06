package com.example.algoritma.algorithmAnswers;

public class BloombergInterview {

    static class Node {
        int key;
        Node left;
        Node right;
        Node parent;

        public Node() {
        }

        public Node(int key) {
            this.key = key;
            left = null;
            right = null;
            parent = null;
        }
    }


    public static Node findInOrderSuccessor(Node inputNode) {
        if (inputNode.right != null) {
           return minValue(inputNode.right);
        } else {
            Node parent=null;
            parent.right=inputNode;
            findParent(inputNode, parent);

        }
        return null;
    }

    // minValue right is not null
    public static Node minValue(Node node) {
        return node.left != null ? minValue(node.left) : node;
    }


    public static Node findParent(Node node, Node parentNode) {
        while (parentNode.key != 0) {
            if (parentNode.right != null) {

                parentNode.right = node;
            } else {
                parentNode.left = node;
            }
        }

        return parentNode;
    }


    public static void main(String[] args) {
        Node root = new Node(20);
        root.right = new Node(25);
        root.left = new Node(9);
        root.left.left = new Node(5);
        root.left.right = new Node(12);
        root.left.right.left = new Node(11);
        root.left.right.right = new Node(14);
        Node par = new Node();
     System.out.println("my result=> " + findInOrderSuccessor(root.left.right.left).key);

    }
}
