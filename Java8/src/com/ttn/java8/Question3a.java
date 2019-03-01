package com.ttn.java8;

interface instanceMethodReference{
    int add(int num1,int num2);

}
interface staticMethodReference2
{
    int subtract(int num1,int num2);
}
public class Question3a {
    int addSomething(int num1,int num2)
    {
        System.out.println(num1+num2);
        return 1;
    }
    int subtractSomething(int n1,int n2)
    {
        System.out.println(n1-n2);
        return 1;
    }

    public static void main(String[] args) {
        Question3a q3a=new Question3a();
        instanceMethodReference obj=q3a::addSomething;
        staticMethodReference2 obj2=q3a::subtractSomething;
         obj.add(5,3);
         obj2.subtract(10,5);

    }
}
