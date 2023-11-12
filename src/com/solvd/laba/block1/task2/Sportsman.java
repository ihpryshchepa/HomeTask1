package com.solvd.laba.block1.task2;

import java.util.Objects;

public class Sportsman extends Person {
    private int age;

    protected Sportsman(String name, String lastName, int age) {
        super(name, lastName);
        this.age = age;
    }

    @Override
    public String toString() {
        return "Sportsman{"
                + "name='" + name + '\''
                + ", lastName=" + lastName + '\''
                + ", age='" + age + '\''
                + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sportsman sportsman = (Sportsman) o;
        return age == sportsman.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }

    protected void printNameLastName() {
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
