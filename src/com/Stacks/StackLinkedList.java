package com.Stacks;

public class StackLinkedList {
    class Node {
        private int data; // 10
        private Node next; // null

        public Node(int item) {
            this.data = item;
            this.next = null;
        }
    }

    private Node top; // Reference to the top of the stack

    public StackLinkedList() {
        this.top = null;
    }

    // utility functions
    public boolean isEmpty() {
        return top == null;
    }

    public void push(int item) {
        Node node = new Node(item);
        node.next = top;
        top = node;
    }

    public int pop() {

        // check stack is empty or not
        if (top == null) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        } else {
            int poppedData = top.data;

            Node temp = top.next;
            top.next = null;
            top = temp;

            System.out.println("Popped " + poppedData + " from the stack.");
            return poppedData;
        }

    }


    public int peek(){
        if(isEmpty()) {
            return -1;
        }
        return top.data;
    }

    public void display(){
        // if stack is empty or not
        if(top == null){
            System.out.println("Stack is empty");
        }else{
            Node current = top;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
        }

    }
}
