package com.ttn.java8;

interface myInterface1c{
        String concat(String a,String b);
        }
public class Question1c {
    public static void main(String[] args) {
        myInterface1c q3=(a,b) ->{return (a+ " " +b);};
        System.out.println(q3.concat("vishkaha","sharma"));
    }
}
