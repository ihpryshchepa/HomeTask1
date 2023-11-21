package com.solvd.laba.block1.task2;

import com.solvd.laba.block1.task2.interfaces.Playable;
import com.solvd.laba.block1.task2.interfaces.Slogan;
import com.solvd.laba.block1.task2.interfaces.Sportsmen;

import java.util.Objects;

public class Sportsman extends Person implements Playable, Slogan, Sportsmen {
    private int age;
    private int strength;
    private int agility;
    private int intelligence;

    protected Sportsman(String name, String lastName, int age) {
        super(name, lastName);
        this.age = age;
    }

    public void setCharacteristics(int strength, int agility, int intelligence) {
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
    }

    public int getSportsmanScore() {
        return age * (strength + agility + intelligence);
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

    @Override
    public void playGame() {
        System.out.println("Method playGame in class Sportsman.");
    }

    @Override
    public void saySlogan() {
        System.out.println("The Sportsman's Slogan");
    }

    @Override
    public void doTrain() {
        System.out.println("The Sportsman trains");
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
