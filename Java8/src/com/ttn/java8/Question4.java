package com.ttn.java8;


interface employeeInterface {

    Employee getinfo(String name, int age, String city);

}

class Employee {
    String name;
    int age;
    String city;

    public Employee(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
        System.out.println("Employee Name:" + name + "  Age:" + age + " City:" + city);
    }
}

public class Question4{

    public static void main(String[] args) {


        employeeInterface obj = Employee::new;
        System.out.println(obj.getinfo("vishakha", 24, "Delhi"));
    }

}

