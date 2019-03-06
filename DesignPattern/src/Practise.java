class A {
    int a;
    int b;

    @Override
    public String toString() {
        return "A{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}

class B {
    public static void main(String[] args) {
        A obj1 = new A();
        obj1.a=9;
        obj1.b=8;
        A obj2=new A();
         obj2.a=obj1.b;
        System.out.println(obj2);




    }
}