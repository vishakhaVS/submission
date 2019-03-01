package com.ttn.java8;
interface staticMethodReference{
   int displayStaticMethodReference(int a,int b);
}

public class Question3b {
    static int staticMethodRef(int a,int b)

    {
        System.out.println("STATIC METHOD REFERENCE");
        System.out.println(a*b);
        return 1;
    }
    public static void main(String[] args) {
        staticMethodReference smr=Question3b::staticMethodRef;
        smr.displayStaticMethodReference(2,20);


    }
}
