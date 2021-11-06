package com.example.algoritma.algorithmAnswers;

public class findParent {
    static class Node
    {
        String data;
        Node leftNode;
        Node rightNode;
        Node(String data)
        {
            this.data = data;
            leftNode = rightNode = null;
        }
    };

    static void findParent(Node node, String val, String parent)
    {
        if (node == null)
            return;

        if (node.data.equals(val))
        {

            System.out.print(parent);
        }
        else
        {

            findParent(node.leftNode, val, node.data);
            findParent(node.rightNode, val, node.data);
        }
    }


    public static void main(String[] args) {
        Node root = new Node("a");
        root.leftNode = new Node("b");
        root.leftNode.leftNode = new Node("c");
        root.leftNode.rightNode = new Node("e");
        root.leftNode.rightNode.leftNode = new Node("f");
        root.rightNode = new Node("g");
        String node = "f";

        findParent(root, node, "");
    }
}
