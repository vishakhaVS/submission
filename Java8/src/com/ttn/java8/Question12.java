package com.ttn.java8;

import java.util.Arrays;
import java.util.List;

public class Question12 {
    public static void main(String[] args) {
        List<Integer> firsteven= Arrays.asList(1,0,1,52,65);
        firsteven.stream()
                .filter(e->e>3)
                .filter(e->e%2==0)
                .forEach(System.out::println);
    }
}