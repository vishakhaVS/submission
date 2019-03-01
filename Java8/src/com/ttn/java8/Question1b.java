package com.ttn.java8;

interface question1binterface
{
    int increment( int a);
}


public class Question1b {
    public static void main(String[] args) {
        question1binterface qi=(a -> ++a);
        System.out.println(qi.increment(30));
    }
}
