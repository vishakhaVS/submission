package com.ttn.java8;
interface intef1{
    default void displayMessage()
    {
        System.out.println("Default method in Interface");
    }
    static void message()
    {
        System.out.println("Static Method Inside Interface");
    }
}

public class Question6 implements intef1 {

    public static void main(String[] args) {
        intef1.message();
        Question6 obj=new Question6();
        obj.displayMessage();

    }
}
