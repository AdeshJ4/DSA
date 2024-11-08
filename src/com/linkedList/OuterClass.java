package com.linkedList;

public class OuterClass {
    private String name = "Adesh";
    private static int age = 23;

    public void displayOuter() {
        System.out.println("Outer " + "\nname " + name + "\nAge " + age );
    }
    
    public class InnerClass {
        public void displayInner () {
            System.out.println("Inner " + "\nname " + name + "\nAge " + age );
        }
    }
}
