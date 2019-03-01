package com.ttn.java8;
interface defaultMethod{
   default void display(){
       System.out.println("hey!!");
   }
}

public class Question7 {

    void display()
    {
        System.out.println("overridden message");
    }

    public static void main(String[] args) {
        Question7 obj=new Question7();
        obj.display();

    }
}
