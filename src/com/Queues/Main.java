package com.Queues;
import java.util.Queue;
import java.util.Stack;

public class Main {


  // Interview Question: reverse Queue
  public static void reverseQueue(Queue<Integer> queue){
    // whenever you have problem which related to doing something in reverse order you must use stack.
    Stack<Integer> stack = new Stack<>();

    // removing item from queue and adding in stack
    while (!queue.isEmpty()) {
        stack.push(queue.remove());
    }

    //removing item from stack and adding in queue
    while (!stack.isEmpty()) {
      queue.add(stack.pop());
    }

  }


  public static void main(String[] args) {

    StackQueue q = new StackQueue();

    q.enqueue(10);
    q.enqueue(20);
    q.enqueue(30);


    
  }
}
