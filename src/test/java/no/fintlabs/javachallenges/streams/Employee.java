package no.fintlabs.javachallenges.streams;

public class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void makePayment() {
        System.out.println("Payment made to " + name);
    }
}