package com.practise.linkedlist;

/**
 * Created by AmbaniP on 13/01/2017.
 */
public class LinkedListDemo {
    public static void main(String args[]) {
        LinkedList<Integer> list = new LinkedList();
        list.insertAtHead(1);
        list.insertAtHead(2);
        list.insertAtHead(3);
        list.insertAtHead(435);
        list.insertAtHead(876);
        list.insertAtHead(86);

        System.out.println(list);

        System.out.println("Length: " + list.length());

        list.deleteFromHead();
        System.out.println("Head: " +list);

        System.out.println("New Length: " + list.length());

        System.out.println("Found: " +list.find(876));

    }
}
