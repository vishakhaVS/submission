package com.ttn.collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Question2 {
    public static void main(String[] args) {

        String string = "vishakha";
        System.out.println("unique characters of " + string +"-"+ uniqueChar(string));
    }

    private static int uniqueChar(String string) {
        Set<Character> characters=new HashSet<>();
        for (char ch:string.toCharArray()) {

            characters.add(ch);
        }
        return characters.size();
    }
}