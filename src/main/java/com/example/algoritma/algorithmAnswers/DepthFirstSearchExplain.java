package com.example.algoritma.algorithmAnswers;

import java.util.ArrayList;
import java.util.List;

public class DepthFirstSearchExplain {
    public static class Node {
        String name;
        List<Node> children = new ArrayList<Node>();

        public Node(String name) {
            this.name = name;
        }

        public List<String> depthFirstSearch(List<String> array) {
            // Write your code here.
            array.add(name);
            children.forEach(child->child.depthFirstSearch(array));
            return array;
        }

        public Node addChild(String name) {
            Node child = new Node(name);
            children.add(child);
            return this;
        }


        public static void main(String[] args) {
            Node node = new Node("A");
            node.addChild("B");
            node.addChild("C");
            node.children.get(0).addChild("K");
            node.children.get(0).addChild("L");
            node.children.get(1).addChild("H");
            node.children.get(1).addChild("T");
            System.out.println(node.depthFirstSearch(new ArrayList<>()));
        }


    }
}
