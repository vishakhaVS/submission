package com.ttn.java2;



public class Question3 {

    public static void main(String[] args) {
        try {
            Class.forName("abc"); //runtime
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }

}
class A
{
    //code
}

class NoClassDef {
    public static void main(String args[]) {
        A a = new A();
    }

}
