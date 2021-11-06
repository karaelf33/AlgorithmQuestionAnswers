package com.example.algoritma.algorithmAnswers;

public class AgitoTree {


    public static void findPath(){}

    static class Node {
        String data;
        Node leftNode, rightNode,parent;

        Node(String data) {
            this.data = data;
            leftNode = rightNode = null;
        }

    }


    public static void main(String[] args) {
        Node root = new Node("a");
        root.leftNode = new Node("b");
        root.leftNode.leftNode = new Node("c");
        root.leftNode.leftNode.leftNode = new Node("d");
        root.leftNode.rightNode = new Node("e");
        root.leftNode.rightNode.leftNode = new Node("f");
        root.rightNode = new Node("g");
        Node node = root.leftNode.rightNode.leftNode;
        Node node2 = root.leftNode.rightNode.leftNode;
    }
}
