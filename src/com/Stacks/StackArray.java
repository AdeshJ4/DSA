package com.Stacks;

import java.util.Arrays;

// push()
// pop()
// peek()
// isEmpty()

public class StackArray {

    private int[] arr = new int[5];
    private int count; 

    public void push(int item){
        // stack is full
        if(count == arr.length){
            throw new StackOverflowError();
        }

        arr[count] = item;
        count++;
    }

    public int pop(){  // [ 10, 20, 0] -> 2 -> 1
        if(count == 0){
            throw new IllegalStateException();
        }

        count--;
        return arr[count];
    }

    @Override
    public String toString(){ 

        int[] myArr = new int[count];  // O(1)
        for(int i=0; i<count; i++){  // O(n) 
            myArr[i] = arr[i];
        }
        return Arrays.toString(myArr);  // O(n)    => O(1 + n + n) => O(1 + 2n)  => O(n)
    }

    public int peek(){
        // stack is empty scenario
        if(count == 0){
            throw new IllegalStateException();
        }

        return arr[count - 1];
    }


    public boolean isEmpty(){
        return count == 0;
    }

}
