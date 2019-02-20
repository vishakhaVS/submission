package bla;

public class Employee {
    String name;
    int age;
    String city;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Employee(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public static class Address
    {
        String state;

        public Address(String state) {
            this.state = state;
        }
    }
}
