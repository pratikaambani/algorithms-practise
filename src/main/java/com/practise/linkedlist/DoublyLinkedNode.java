package com.practise.linkedlist;

/**
 * Created by AmbaniP on 13/01/2017.
 */
public class DoublyLinkedNode {
    private int data;
    private DoublyLinkedNode previousNode;
    private DoublyLinkedNode nextNode;

    public DoublyLinkedNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public DoublyLinkedNode getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(DoublyLinkedNode previousNode) {
        this.previousNode = previousNode;
    }

    public DoublyLinkedNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(DoublyLinkedNode nextNode) {
        this.nextNode = nextNode;
    }
}
