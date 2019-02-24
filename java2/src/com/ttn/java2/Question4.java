package com.ttn.java2;

public class Question4 {
    public static void main(String[] args) {
        Singleton  single = Singleton.getInstance();
        Singleton  single2 = Singleton.getInstance();
        System.out.println(single==single2);
    }
}

class Singleton{
    private static Singleton obj ;

    private Singleton() {}
    static Singleton getInstance() {
        if(obj==null) {
            obj = new Singleton();
        }
        return obj;
    }
}

