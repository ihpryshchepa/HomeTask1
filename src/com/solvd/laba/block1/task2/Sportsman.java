package com.solvd.laba.block1.task2;

import com.solvd.laba.block1.task2.exceptions.InvalidAgeException;
import com.solvd.laba.block1.task2.exceptions.InvalidCharacteristicsException;
import com.solvd.laba.block1.task2.interfaces.Playable;
import com.solvd.laba.block1.task2.interfaces.Sportsmen;

import java.util.Objects;

public class Sportsman extends Person implements Playable, Sportsmen {
    private int age;
    private int strength;
    private int agility;
    private int intelligence;

    protected Sportsman(String name, String lastName) {
        super(name, lastName);
    }

    public void setCharacteristics(int strength, int agility, int intelligence) throws InvalidCharacteristicsException {
        if (strength > 0 & agility > 0 & intelligence > 0) {
            this.strength = strength;
            this.agility = agility;
            this.intelligence = intelligence;
        } else {
            throw new InvalidCharacteristicsException("Characteristics can not be negative.");
        }
    }

    public void setDefaultCharacteristics() {
        this.strength = 5;
        this.agility = 5;
        this.intelligence = 5;
    }

    public int getSportsmanScore() {
        return age * (strength + agility + intelligence);
    }

    public void printNameLastName() {
        System.out.println("My name is " + getName() + " " + getLastName());
    }

    @Override
    public void playGame() {
        System.out.println("Method playGame in class Sportsman.");
    }

    @Override
    public void doTrain() {
        System.out.println("The Sportsman trains");
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

    public void setAge(int age) throws InvalidAgeException {
        if (age > 0) {
            this.age = age;
        } else {
            throw new InvalidAgeException("Age can not be negative.");
        }
    }

    public void setDefaultAge() {
        this.age = 18;
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
}
