package com.ttn.java8;
interface question1d{
    String convert(String str);

}

public class Question1d {
    public static void main(String[] args) {
        question1d q1d=(str -> str.toUpperCase());
        System.out.println(q1d.convert("vishakha"));
    }
}
