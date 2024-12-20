package com.Queues;

import java.util.Stack;

public class StackQueue {
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();


    public void enqueue(int item){
        stack1.push(item);  // O(1)
    }

    public int dequeue(){

        if(isEmpty()){
            throw new IllegalStateException();
        }

        if(stack2.isEmpty()){   // O(n)
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.pop();
    }


    public boolean isEmpty(){
        return stack1.isEmpty() && stack2.isEmpty();
    }


    public int peek(){
        if(isEmpty()){
            return -1;
        }

        return stack2.peek();
    }
}
