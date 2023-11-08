package com.solvd.laba.block1.task2;

public class Sportsman extends Person {
    private String name;
    private String lastName;
    private int age;

    Sportsman(String name, String lastName) {
        super(name, lastName);
    }

    Sportsman(String name, String lastName, int age) {
        super();
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    void printNameLastName() {
        System.out.println("My name is " + getName() + " " + getLastName());
    }

    public String getName() {
        return name;
    }

    public void setName(String newName){
        this.name = newName;
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
