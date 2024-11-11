package com.linkedList;
import java.util.NoSuchElementException;

public class LinkedList {

    private class Node {
        private int value;
        private Node next;

        public Node (int value){
            this.value = value;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    // checks list is empty or not,
    private boolean isEmpty () {
        return head == null;
    }

    public Node getPreviousNode(Node node) {
        Node current = head;
        while(current!=null){
            if(current.next == node) return current;
            current = current.next; 
        }
        return null;
    }


    public void addLast(int item) {
        Node node = new Node(item);
        // Check if the list is empty
        if (isEmpty()) {
            head = tail = node;
        } else {
            // List has at least one node
            tail.next = node;
            tail = node;
        }
        size++; 
    }
    

    public void addFirst(int item){
        Node node = new Node(item);

        // check list is empty or not:
        if(head == null){
            head = tail = node;
        }else{
            node.next = head;
            head = node;
        }
        size++;
    }

    public int indexOf(int item){
        int index = 0;
        Node current;
        current = head;
        while (current != null) {
            if(current.value == item){
                return index;
            }
            current = current.next; 
            index++;
        }

        return -1;  // if you don't find anything
    }

    public boolean contains(int item){
        // because we rebuild this logic in indexOf() method
        return indexOf(item) != -1;
    }

    public void removeFirst() {
        // Check if the list is empty
        if (head == null) {
            throw new NoSuchElementException();
        }
    
        // If the list has only one item
        if (head == tail) {
            head = tail = null;
        } else {
            // If the list has more than one item
            Node temp = head.next;
            head.next = null;
            head = temp;
        }
    
        size--;
    }
    


    // my logic
    // public void removeLast(){
    //     Node current = head;
    //     Node secondLast;
    //     while(current!=null){
    //         if(current.next.next == null){
    //             secondLast =  current;
    //             current.next = null;
    //             tail = secondLast;
    //         }
    //         current = current.next; 
    //     }
    // }

    // mosh
    public void removeLast(){

        // check if list is empty or not
        if(head == null){
            throw new NoSuchElementException();
        }

        // one element exist
        if(head == tail){
            head = tail = null;
        }else{
            // at least two elements 
            Node previous = getPreviousNode(tail);
            tail = previous;
            tail.next = null;
        }

        size--;
    }

    public int size(){
        // as we add or remove elements we change value of size variable. its more efficient
        // time complexity : O(1)
        return size;
    }

    // public int size(){
    // // we don't have to use this approach brecause if we have 1 million items then it will take time and if we call this method again and again then think what will cost.  
    // // time complexity : O(n)
    //     int counter = 0;
    //     Node current = head;
    //     while(current != null){
    //         current = current.next;
    //         counter++;
    //     }
    //     return counter;
    // }


    public int[] toArray(){
        int index = 0;
        Node current = head;
        int[] arr = new int[size];
        while (current != null) {
            arr[index] = current.value;
            current = current.next;
            index++;
        }

        // System.out.println(Arrays.toString(arr));
        return arr;
    }
}   
 

// addFirst 
// addLast
// deleteFirst
// deleteLast
// contains
// indexOf