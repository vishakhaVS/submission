package com.ttn.collections;

import java.util.ArrayList;
import java.util.Comparator;



    class Employee {
        private String name;
        private double salary;
        private double age;

        Employee(String name, double salary, double age) {
            this.name = name;
            this.salary = salary;
            this.age = age;
        }


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public double getAge() {
            return age;
        }

        public void setAge(double age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", salary=" + salary +
                    ", age=" + age +
                    '}';
        }
    }

    class EmployeeMain{

    public static void main(String[] args) {

        ArrayList<Employee> arrayList = new ArrayList<>();
        arrayList.add(new Employee("name1",1141.32,23));
        arrayList.add(new Employee("name2",222.55,54));
        arrayList.add(new Employee("name3",3555.66,25));
        arrayList.add(new Employee("name4",4444.32,24));
        arrayList.add(new Employee("name5",66667.32,66));
        arrayList.add(new Employee("name6",77777.32,47));
        arrayList.add(new Employee("name7",88888.32,24));
        arrayList.add(new Employee("name8",9999.32,35));
        arrayList.add(new Employee("name9",9574.99,45));

        arrayList.sort(new Employee_Comparator());
        for (Employee employee:arrayList){
            System.out.println(employee.getSalary());
        }
    }
}

    class Employee_Comparator implements Comparator<Employee> {
        public int compare(Employee employeeA,Employee employeeB){
            if(employeeA.getSalary() == employeeB.getSalary()){
                return 0;
            }
            if(employeeA.getSalary() < employeeB.getSalary()){
                return 1;
            }
            else {
                return -1;
            }
        }
    }





