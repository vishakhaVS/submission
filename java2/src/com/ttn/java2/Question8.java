package com.ttn.java2;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = keyboard.next();
        while (!word.equals("done")) {
            if (word.charAt(0) == word.charAt(word.length() - 1)) {
                System.out.println("First and last characters matched " + word);
            } else {
                System.out.println("First and last characters not matched " + word);
            }
            word = keyboard.next();
        }

        System.out.println("---------------------------------------------------------");


        Scanner keyboardOfDoWhile = new Scanner(System.in);
        System.out.println("Enter a word");
        String wordInDoWhile = keyboardOfDoWhile.next();
        do {
            if (wordInDoWhile.charAt(0) == wordInDoWhile.charAt(wordInDoWhile.length() - 1)) {
                System.out.println("First and last characters matched " + wordInDoWhile);
            } else {
                System.out.println("First and last characters not matched " + wordInDoWhile);
            }
            wordInDoWhile = keyboardOfDoWhile.next();
        } while (!wordInDoWhile.equals("done"));

    }
}