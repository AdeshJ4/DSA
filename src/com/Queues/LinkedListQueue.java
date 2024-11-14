package com.Queues;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class LinkedListQueue {

  private class Node {
    private int value;
    private Node next;

    public Node(int item){
      this.value = item;
      this.next = null;
    }
  }


  private Node head;
  private Node tail;
  private int size;


  public void enqueue(int item){
    Node node = new Node(item);
    // list is empty or not
    if(head == null){
      head = tail = node;
    }else{
      tail.next = node;
      tail = node;
    }
    size++;
  }


  public void dequeue(){
    // Check if the list is empty
    if(head == null){
      throw new NoSuchElementException();
    } else if(head == tail){
      // if the list has single item
      head = tail = null;
    }else{
      Node temp = head.next;
      head.next = null;
      head = temp;
    }

    size--;
  }


  public int peek(){
    System.out.println(head.value);
    return head.value;
  }

  public boolean isEmpty(){
    System.out.println(head == null);
    return head == null;
  }


  public void toArray(){
    int index = 0;
    Node current = head;
    int[] arr = new int[size];
    while (current !=null) {
      arr[index] = current.value;
      current = current.next;
      index++;
    }

    System.out.println(Arrays.toString(arr));
  }



  public static void main(String[] args) {
    LinkedListQueue queueList = new LinkedListQueue();

    queueList.enqueue(10);
    queueList.enqueue(20);
    queueList.enqueue(30);

    queueList.peek();
    queueList.isEmpty();

    queueList.toArray();
  }
}
