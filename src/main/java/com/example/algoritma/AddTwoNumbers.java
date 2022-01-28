package com.example.algoritma;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Vector;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order, and each of their nodes contains a single digit.
 * Add the two numbers and return the sum as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */
public class AddTwoNumbers {

    public static class ListNode {

        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode result = new ListNode(0);
        collectListItems(l1, l2, result, carry);
        return result.next;
    }

    public static ListNode collectListItems(ListNode l1, ListNode l2, ListNode result, int carry) {
        if (l1 == null && l2 == null) {
            if (carry > 0) {
                result.next = new ListNode(carry);
            }
            return result;
        }
        int sum = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + carry;
        carry = sum / 10;
        result.next = new ListNode(sum % 10);
        return collectListItems(l1 != null ? l1.next : null, l2 != null ? l2.next : null, result.next, carry);
    }

    public static class Person {
        String name;
        String surname;

        public Person(String name) {
            this.name = name;
        }
    }


    public static void main(String[] args) {
        Person person = new Person("Ahmet");
        Person person1 = new Person("1");
        String s=new String("Hello");
        String s1=new String("Hello");

        System.out.println(person.getClass().getName().equals(person1.getClass().getName()));
        System.out.println(person1.getClass());
        System.out.println(person == person1);
        System.out.println(person.equals(person1));
        System.out.println("---------------");
        System.out.println(s==s1);
        System.out.println(s.equals(s1));
       /* ListNode l1 = new ListNode(9);
        l1.next = new ListNode(9);
        l1.next.next = new ListNode(9);
        l1.next.next.next = new ListNode(9);
        l1.next.next.next.next = new ListNode(9);
        l1.next.next.next.next.next = new ListNode(9);
        l1.next.next.next.next.next.next = new ListNode(9);

        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(9);
        l2.next.next = new ListNode(9);
        l2.next.next.next = new ListNode(9*/

//        addTwoNumbers(l1, l2);

        //  Hashtable<Integer, Integer> hashtable = new Hashtable<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        hashMap.put(1, null);
        hashMap.put(null, 2);
        hashMap.put(null, 1);


        //hashtable.put(1, 1);

        System.out.println(hashMap);
        // System.out.println(hashtable);


    }
}
