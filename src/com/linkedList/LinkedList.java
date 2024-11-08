package com.linkedList;



public class LinkedList {

    private class Node {
        private int value;
        private Node next;
    }

    private Node first;
    private Node last;

    public void  addLast(int item){
        Node node = new Node();
        node.value = item;
    }

}
 

// addFirst 
// addLast
// deleteFirst
// deleteLast
// contains
// indexOf