package com.ttn.java8;

interface instanceMethodReference{
    void print();
}
public class Question3a {
    void printSomething()
    {
        System.out.println("Print Something");
    }

    public static void main(String[] args) {
        Question3a q3a=new Question3a();
        instanceMethodReference obj=q3a::printSomething;
         obj.print();
    }
}
