package com.ttn.java8;
interface staticMethodReference{
   void displayStaticMethodReference();
}

public class Question3b {
    static void staticMethodRef()
    {
        System.out.println("STATIC METHOD REFERENCE");
    }
    public static void main(String[] args) {
        staticMethodReference smr=Question3b::staticMethodRef;
        smr.displayStaticMethodReference();

    }
}
