package com.practise.linkedlist;

/**
 * Created by AmbaniP on 13/01/2017.
 */
public class DoublyEndedListDemo {

    public static void main(String args[]) {
        DoublyEndedList dList = new DoublyEndedList();
        dList.insertAtTail(11);
        dList.insertAtTail(36);
        dList.insertAtTail(16);

        System.out.println("List: " +dList);
    }
}
