package com.Queues;

import java.util.Arrays;

public class PriorityQueue {

  private int[] items;
  private int count;

  public PriorityQueue() {
    items = new int[5];
    count = 0;
  }

  public void add (int item){
    // for loop for shifting items.
    int i;
    for (i = count - 1; i >= 0; i-- ){
      if(items[i] > item){
        // copy value of current cell to right cell
         items[i+1] = items[i];
      }else{
         // what if current item is not greater than value, that means we found position for item to insert and we are done with shifting, so break from loop.\
         break;
      }
    }

    items[i + 1] = item;
    count++;
  }


  public String toString(){
    return Arrays.toString(items);
  }



  public static void main(String[] args){
  }
}
