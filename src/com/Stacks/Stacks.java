package com.Stacks;

import java.util.Stack;

public class Stacks {
  public String reverseString(String str) {
    Stack<Character> stack = new Stack<>();

    // // traditional for loop
    // for(int i=0; i<str.length(); i++){
    //   stack.push(str.charAt(i));
    // }

    // for each loop cannot used on array so we have to convert it into character array.
    for(char ch: str.toCharArray()){
      stack.push(ch);
    }

    /*  
    every time u run this while loop a new string object is created in memory because Strings are immutable(can't changed)
    in java, we can't modify them, when you modify string a new memory is allocated or new string is created.
    so solution for this is we can use StringBuffer class which is used for string manipulation.
    */ 
    StringBuffer reversed = new StringBuffer();
    while (!stack.empty()) {
      reversed.append(stack.pop());
    }

    // convert string buffer to string
    return reversed.toString();

  }
}
