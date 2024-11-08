package com.codeWithAdesh;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void display(){
        int[] arr = {};

        System.out.println(Arrays.toString(arr));

        for( int i=0; i<5; i++){
            arr[i] = 10;
        }
    }

    public static void main(String[] args){
        Array numbers = new Array(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.insert(10);
        numbers.insert(30);
        numbers.insert(30);

        // Main.display();
        numbers.intersect();

    }
}