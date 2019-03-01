package com.ttn.java8;

import java.util.function.Supplier;

public class Question5b {

    public static void main(String[] args) {
        Supplier <String>s1=()->"Supplier Interface";
        System.out.println(s1.get());

    }
}
