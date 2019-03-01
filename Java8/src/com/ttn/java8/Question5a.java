package com.ttn.java8;

import java.util.function.Consumer;

public class Question5a{
    static void display(String str) {
        System.out.println("hello world!!");
        System.out.println(str);
    }

    public static void main(String[] args) {
        Consumer<String> consume = Question5a::display;
        consume.accept("Whatever");
    }
}
