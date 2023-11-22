package com.solvd.laba.block1.task2;

import com.solvd.laba.block1.task2.interfaces.Slogan;

public class Trainer extends Person implements Slogan {
    private String status;
    private int yearsOfExp;

    protected Trainer(String name, String lastName, String status) {
        super(name, lastName);
        this.status = status;
    }

    public void printNameLastName() {
        System.out.println("My name is " + getName() + " " + getLastName());
    }

    @Override
    public void saySlogan() {
        System.out.println("The Trainer's Slogan");
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

    public int getYearsOfExp() {
        return yearsOfExp;
    }

    public void setYearsOfExp(int yearsOfExp) {
        this.yearsOfExp = yearsOfExp;
    }


}
