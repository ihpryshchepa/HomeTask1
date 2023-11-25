package com.solvd.laba.block1.task2;

import com.solvd.laba.block1.task2.interfaces.SloganInterface;

public abstract class Person implements SloganInterface {
    protected String name;
    protected String lastName;

    protected Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    protected abstract void printNameLastName();

    @Override
    public void saySlogan(String slogan) {
        System.out.println("The person slogan is - " + slogan);
    }
}
