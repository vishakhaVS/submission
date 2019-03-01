package com.ttn.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question9 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,28);
      List<Integer> resultList=  list.stream()
                .filter(e-> e%2==0)
                .collect(Collectors.toList());
        System.out.println(resultList);
    }
}
