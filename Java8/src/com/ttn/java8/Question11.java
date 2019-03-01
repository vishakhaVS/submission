package com.ttn.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question11 {
    public static void main(String[] args) {
        List<Integer> list3 = Arrays.asList(5, 4, 3, 2, 1);
        System.out.println(list3.stream()
                .collect(Collectors.averagingInt(x -> x * 2)));


    }
}
