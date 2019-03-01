package com.ttn.multithreading;
class Question1 implements Runnable{
    public void run(){
        System.out.println("thread is running...");
    }

    public static void main(String args[]){
        Question1 obj=new Question1();
        Thread t1 =new Thread(obj);
        t1.start();
    }
}