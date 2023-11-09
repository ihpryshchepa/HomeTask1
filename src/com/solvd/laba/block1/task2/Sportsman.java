package com.solvd.laba.block1.task2;

public class Sportsman extends Person {
    private int age;

    Sportsman(String name, String lastName, int age) {
        super(name, lastName);
        this.age = age;
    }

    void printNameLastName() {
        System.out.println("My name is " + getName() + " " + getLastName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }
}
