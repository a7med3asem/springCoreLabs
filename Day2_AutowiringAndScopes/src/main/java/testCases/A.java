package testCases;

public class A {
    B b;

    A() {
        System.out.println("a is created");
    }

    public A(B b) {
        System.out.println("a is created A(B b) ");
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }

    void print() {
        System.out.println("hello a");
    }

    void display() {
        print();
        b.print();
    }
}
