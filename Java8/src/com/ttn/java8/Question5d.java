package com.ttn.java8;

import java.util.function.Function;

public class Question5d {
    public static void main(String[] args) {
        Function<String,String> combine=str1->str1+ " " +"world";
        System.out.println(combine.apply("Hello"));
    }
}
