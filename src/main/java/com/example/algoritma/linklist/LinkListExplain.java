package com.example.algoritma.linklist;

public class LinkListExplain {

    public static class Node {
        int data;
        Node next;

        public Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    public static class Main {
        Node head;

        public void push(int data) {
            Node new_node = new Node(data);
            new_node.next = head;
            head = new_node;
        }

        public boolean search(Node head, int x) {
            Node current = head;
            while (current != null) {
                if (current.data == x) {
                    return true;
                }
                current = current.next;
            }
            return false;

        }
    }

    public static void main(String[] args) {


        Main mylist = new Main();
        mylist.push(1);
        mylist.push(2);
        mylist.push(3);
        mylist.push(4);
        mylist.push(5);

        System.out.println(mylist);

        if (mylist.search(mylist.head, 4)) {
            System.out.println("yesy");
        } else {
            System.out.println("no");
        }

    }
}
