package com.solvd.laba.block1.task2;

public abstract class Person {
    protected String name;
    protected String lastName;

    protected Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    protected abstract void printNameLastName();
}
