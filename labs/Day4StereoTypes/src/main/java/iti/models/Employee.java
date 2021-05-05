package iti.models;

public class Employee {
    private String role;
    private String name;
    private int age;

    public String getName() {
        System.out.println("Name = " + name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        System.out.println("Age = " + age);
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRole() {
        System.out.println("Role = " + role);
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
