package com.practise.linkedlist;

/**
 * Created by AmbaniP on 13/01/2017.
 */
public class DoublyLinkedList {

    private DoublyLinkedNode head;

    public void insertAtHead(int data) {
        DoublyLinkedNode newNode = new DoublyLinkedNode(data);
        newNode.setNextNode(this.head);
        if(this.head != null)
            this.head.setPreviousNode(newNode);
        this.head = newNode;
    }

}
