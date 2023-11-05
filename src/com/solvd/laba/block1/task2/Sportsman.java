package com.solvd.laba.block1.task2;

public class Sportsman {
    private int age;
    private String name;

    Sportsman(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName){
        this.name = newName;
    }
}
