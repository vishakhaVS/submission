package com.ttn.DesignPattern;



 class BuilderPattern {
    public static void main(String[] args) {
        System.out.println("Student Created using Student Builder \n" + new StudentBuilder()
                .withName("Vishakha")
                .withRollNo(48)
                .withAge(24)
                .withGender('F')
                .optedSchoolTransport(true)
                .withPercentage(98)
                .build());
        System.out.println("Student Created using Student Builder \n" + new StudentBuilder()
                .withName("Yatharth")
                .withRollNo(49)
                .withAge(50)
                .withGender('O')
                .withPercentage(60)
                .build());

    }
}

class Student {

    private Integer rollNo;
    private String name;
    private Integer age;
    private Integer percentage;
    private char gender;
    private boolean isUsingSchoolTransport;

    Student(StudentBuilder studentBuilder) {
        rollNo = studentBuilder.getRollNo();
        name = studentBuilder.getName();
        age = studentBuilder.getAge();
        gender = studentBuilder.getGender();
        percentage = studentBuilder.getPercentage();
        isUsingSchoolTransport = studentBuilder.isOptedSchoolTransport();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", age=" + age +
                ", gender=" + gender +
                ", percentage=" + percentage +
                ", isUsingSchoolTransport=" + isUsingSchoolTransport +
                '}';
    }
}


class StudentBuilder {
    private Integer rollNo;
    private String name;
    private Integer age;
    private Integer percentage;
    private char gender;
    private boolean optedSchoolTransport;

    String getName() {
        return name;
    }

    StudentBuilder withName(String name) {
        this.name = name;
        return this;
    }

    Integer getRollNo() {
        return rollNo;
    }

    StudentBuilder withRollNo(Integer rollNo) {
        this.rollNo = rollNo;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    StudentBuilder withAge(Integer age) {
        this.age = age;
        return this;
    }

    char getGender() {
        return gender;
    }

    StudentBuilder withGender(char gender) {
        this.gender = gender;
        return this;
    }

    boolean isOptedSchoolTransport() {
        return optedSchoolTransport;
    }

    StudentBuilder optedSchoolTransport(boolean optedSchoolTransport) {
        this.optedSchoolTransport = optedSchoolTransport;
        return this;
    }

    Integer getPercentage() {
        return percentage;
    }

    StudentBuilder withPercentage(Integer percentage) {
        this.percentage = percentage;
        return this;
    }

    Student build() {
        return new Student(this);
    }
}