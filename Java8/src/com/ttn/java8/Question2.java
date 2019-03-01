package com.ttn.java8;

interface Question2Interface{
    int add(int number1,int number2);
}


public class Question2 {

    public static void main(String[] args) {
        Question2Interface qi2=(n1,n2)-> n1+n2;
        System.out.println(qi2.add(20,8));
    }
}
