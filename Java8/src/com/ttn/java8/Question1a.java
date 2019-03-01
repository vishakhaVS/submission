package com.ttn.java8;

//comparison of a and b using functional interface
interface myInterface{
    boolean compare(int num1,int num2);

}


public class Question1a {
    public static void main(String[] args) {
        myInterface mi=(a, b)->{ return a<b; };

        System.out.println(mi.compare(1,2));;
    }

}
