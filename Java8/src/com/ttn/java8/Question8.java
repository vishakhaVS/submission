package com.ttn.java8;

interface inter1 {
    default void display() {
        System.out.println("inter1");
    }
}

interface child1 extends inter1 {
    default void display() {
        System.out.println("child1");
    }
}

interface child2 extends inter1 {
    default void display() {
        System.out.println("child2");
    }
}

public class Question8 implements child1, child2 {
    //inter1


    public void display() {
        System.out.println("DefaultMethods");
        child2.super.display();
        child1.super.display();
        // inter1.super.display();


    }

    public static void main(String[] args) {
        Question8 defaultMethods = new Question8();
        defaultMethods.display();
    }
}

