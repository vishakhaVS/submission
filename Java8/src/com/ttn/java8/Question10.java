package com.ttn.java8;

import java.util.Arrays;
import java.util.List;


public class Question10 {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(4, 1, 6,10);
        int resultList = list1
                .stream().mapToInt(e -> e > 5 ?e:0)
                .sum();



        System.out.println(resultList);
    }
}
