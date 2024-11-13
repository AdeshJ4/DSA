package com.Queues;

import java.util.Arrays;

public class ArrayQueue {
  private int[] items;
  private int front;
  private int rear;
  private int count;


  public ArrayQueue(int capacity){
      items = new int[capacity];
      rear = 0;
      count = 0;
      front = 0;
  }

  //adds item to end of the queue.
  public void enqueue(int item){

    // check queue is full or not 
    if(count == items.length){ 
      throw new IllegalStateException();
    }else{
      items[rear] = item;
      rear = (rear + 1) % items.length;  // for this logic refer notes and img 1.4  -> reminder is index
    }
    count++; 
  }


  // removes an element from the front of the queue
  public int dequeue(){  // [ 10, 20, 30 ]  => [ 0, 20, 30 ]
    int item = items[front];
    items[front] = 0;
    front = (front + 1) % items.length;   // for this logic refer notes and img 1.4
    count--;
    return item;
  }


  // return front element of the queue without removing it.
  public int peek() {
    return items[front];
  }

  public boolean isEmpty(){
    return count == 0;
  }

  public boolean isFull(){
    return count == items.length;
  }

  @Override
  public String toString(){
    return Arrays.toString(items);
  }

}
