package com.solvd.laba.block1.task2;

public abstract class Person {
    String name;
    String lastName;

    Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    abstract void printNameLastName();
}
