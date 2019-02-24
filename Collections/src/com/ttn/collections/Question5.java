package com.ttn.collections;

import java.util.ArrayList;
import java.util.Comparator;

class Student {
    private String name;
    private double score;
    private double age;

    public Student(String name, double score, double age) {
        this.name = name;
        this.score = score;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }
}

 class StudentMain {
    public static void main(String[] args) {
        ArrayList<Student> arrayList=new ArrayList<>();
        arrayList.add(new Student("Name1",1000,34));
        arrayList.add(new Student("Manisha",1000,45));
        arrayList.add(new Student("Name3",3000,56));
        arrayList.add(new Student("Name4",7000,24));
        arrayList.add(new Student("Name5",33000,74));
        arrayList.add(new Student("Name6",1500,23));
        arrayList.add(new Student("Deva",1500,52));
        arrayList.add(new Student("Name8",9000,22));
        arrayList.add(new Student("Name9",8800,32));

        arrayList.sort(new Student_Comparator());
        for (Student student:arrayList){
            System.out.println("Name is: " +student.getName()+" Score is: "+student.getScore());
        }
    }
}


class Student_Comparator implements Comparator<Student> {
    public int compare(Student student1,Student student2){
        if (student1.getScore()==student2.getScore()){
            return student1.getName().compareTo(student2.getName());
        }
        if(student1.getScore()>student2.getScore()){
            return 1;
        }
        else {
            return -1;
        }
    }
}