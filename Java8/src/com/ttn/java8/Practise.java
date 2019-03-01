package com.ttn.java8;
//method reference
interface myInterface4
{
    int display(int a,int b);

}

class Ex1_4 {
    static int displayMethodRef(int a,int b)
    {
        System.out.println("inside displayFunctionalInterface");
        return a+b;
    }
    public static void main(String[] args) {




        myInterface4 mi4 = Ex1_4::displayMethodRef;

        System.out.println(mi4.display(1,2));
    }
}





