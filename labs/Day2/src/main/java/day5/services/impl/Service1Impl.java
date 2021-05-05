package day5.services.impl;

import day5.services.Service1;

public class Service1Impl implements Service1 {
    private int age;
    private String name;

    private static Service1Impl serviceInstance;

    public Service1Impl() {
        System.out.println("Service1Impl()\n");
    }

    public Service1Impl(int age) {
        this.age = age;
        System.out.println("Service1Impl(" + age + ")\n");
    }

    public Service1Impl(String name) {
        this.name = name;
        System.out.println("Service1Impl(" + name + ")\n");
    }

    public Service1Impl(int age, String name) {
        this.age = age;
        this.name = name;
        System.out.println("Service1Impl(" + age + ", " + name + ")\n");
    }

    public static Service1Impl createService1Impl() {
        System.out.println("static Service1Impl createService1Impl()");
        return new Service1Impl();
    }

    public static Service1Impl createService1Impl(int age) {
        System.out.println("static Service1Impl createService1Impl(int age)");
        return new Service1Impl(age);
    }

    public static Service1Impl createService1Impl(String name) {
        System.out.println("static Service1Impl createService1Impl(String name)");
        return new Service1Impl(name);
    }

    public static Service1Impl createService1Impl(int age, String name) {
        System.out.println("static Service1Impl createService1Impl(int age, String name)");
        return new Service1Impl(age, name);
    }

    @Override
    public void print() {
        System.out.println("From service1Impl");
    }
}
