package com.Stacks;

public class Main {
    public static void main(String[] args){

        StackLinkedList stack = new StackLinkedList();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.pop();
        stack.display();
        System.out.println("last Element: " + stack.peek());

    }
}