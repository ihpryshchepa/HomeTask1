package com.solvd.laba.block1.task2;

import com.solvd.laba.block1.task2.exceptions.InvalidYearsOfExperience;
import com.solvd.laba.block1.task2.interfaces.Slogan;

public class Trainer extends Person {
    private String status;
    private int yearsOfExp;

    protected Trainer(String name, String lastName, String status) {
        super(name, lastName);
        this.status = status;
    }

    public void printNameLastName() {
        System.out.println("My name is " + getName() + " " + getLastName());
    }

    public int getYearsOfExp() {
        return yearsOfExp;
    }

    public void setYearsOfExp(int yearsOfExp) throws InvalidYearsOfExperience {
        if (yearsOfExp > 0) {
            this.yearsOfExp = yearsOfExp;
        } else {
            throw new InvalidYearsOfExperience("Count years of experience can not be negative.");
        }
    }

    public void setDefaultYearsOfExperience() {
        this.yearsOfExp = 10;
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
