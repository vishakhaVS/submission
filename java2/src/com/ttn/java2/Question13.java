package com.ttn.java2;

public class Question13 {
     static void function1() throws Exception{
        throw new Exception("function1 Exception");
    }

    static void function2() throws Throwable{
        try{
            function1();
        } catch (Exception e) {
            System.err.println("Inside function2()");
            throw e.fillInStackTrace(); //no output is shown
        }
    }

    public static void main(String[] args) throws Throwable{
        try{
            function2();
        } catch (Exception e) {
            System.err.println("Inside main");
           // e.printStackTrace();
        }
    }
}
