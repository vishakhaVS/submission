package com.ttn.java8;

import java.util.function.Predicate;

public class Question5c {
    public static void main(String[] args) {
        Predicate<Integer> p=num ->num>5;
        System.out.println( p.test(50));
        System.out.println( p.test(2));
    }
}
