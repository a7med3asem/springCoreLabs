package iti.models;

public class User {
    private String firstName;
    private String lastName;

    public User() {
        System.out.println("User()\n");
    }

    public User(String firstName, String lastName) {
        System.out.println("User(String firstName, String lastName)\n");
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
