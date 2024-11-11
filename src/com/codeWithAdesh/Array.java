package com.codeWithAdesh;

public class Array {

    private int[] items;
    private int count;   // represent total no of items in array

    public Array(int length){
        items = new int[length];
    }

    public void print(){
        for(int i=0; i<count; i++){
            System.out.println(items[i]);
        }
    }

    public void insert(int item){
        // if the array is full, resize it.
        if(items.length == count){
            // create a new array (twice the size)
            int[] newItems = new int[count * 2];

            // copy all existing items 
            for(int i=0; i<count; i++){
                newItems[i] = items[i];
            }

            // set items to this new array
            items = newItems;
        }


        // add new item at the end
        items[count] = item;
        count++;
    }

    public void removeAt(int index){
        // validate index like its in range or not.
        if(index < 0 || index >= count){  // if count is 4 then last item index is 3
            throw new IllegalArgumentException();
        }

        // Shift the items to the left to fill the hole
        // [10, 20, 30, 40]
        for(int i = index; i<count; i++){
            items[i] = items[i+1];
        }

        count--;  // because you still have 4 items [10, 30, 40, 40] if index is 1.
    }

    public int indexOf(int item){
        for(int i = 0; i<count; i++){  // O(n)
            if(items[i] == item) {
                return i;
            }
        }

        return -1;
    }

    public int max(){  // [10, 30, 50, 40, 10, 20]
        for (int i=0; i<count; i++){
            if(items[i] > items[i+1]){
                items[i+1] = items[i];
            }
        }

        return items[count-1];
    }

    public void intersect() { // [10, 30, 50, 50, 40, 10, 20]
        int[] duplicate = new int[count];
        int index = 0;
        for(int i=0; i<count; i++){
            for(int j=i+1; j<count; j++){
                if(items[i] == items[j]){
                    duplicate[index] = items[i];
                    index++;
                }
            }
        }

        for(int i=0; i<duplicate.length; i++){
            System.out.print(duplicate[i] + " ");
        }
        // System.out.println(Arrays.toString(duplicate));
    }
}

/*
 * calling methods :
 * 
 *     public static void main(String[] args){
        Array numbers = new Array(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.insert(50);
        // numbers.removeAt(4);
        System.out.println(numbers.indexOf(500));

        // numbers.print();
    }
 */