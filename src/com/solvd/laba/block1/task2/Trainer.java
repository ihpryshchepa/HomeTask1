package com.solvd.laba.block1.task2;

public class Trainer extends Person {
    private String status;

    Trainer(String name, String lastName, String status) {
        super(name, lastName);
        this.status = status;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
