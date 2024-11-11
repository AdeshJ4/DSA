package com.Stacks;

public class StackLinkedList {
    class Node {
        private int data;  // 10
        private Node next; // null

        public Node(int item){
            this.data = item;
            this.next = null;
        }
    }

    private Node top;  // Reference to the top of the stack

    public StackLinkedList(){
        this.top = null;
    }

    public void push(int item){
        Node node = new Node(item);
        node.next = top;
        top = node;
    }



}
