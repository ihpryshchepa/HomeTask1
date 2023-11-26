package com.solvd.laba.block1.task2;

import com.solvd.laba.block1.task2.exceptions.InvalidAgeException;
import com.solvd.laba.block1.task2.exceptions.InvalidCharacteristicsException;
import com.solvd.laba.block1.task2.interfaces.ScoreInterface;
import com.solvd.laba.block1.task2.interfaces.SloganInterface;
import com.solvd.laba.block1.task2.interfaces.TrainingInterface;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public class Sportsman extends Person implements SloganInterface, ScoreInterface, TrainingInterface {
    private static final Logger LOGGER = LogManager.getLogger(Sportsman.class);

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

    @Override
    public int calculateScore() {
        return age * (strength + agility + intelligence);
    }

    @Override
    public void saySlogan(String slogan) {
        LOGGER.info("The sportsman slogan is - " + slogan);
    }

    @Override
    public void printNameLastName() {
        LOGGER.info("My name is " + getName() + " " + getLastName() + " and I am sportsman!");
    }

    @Override
    public void doTraining(int hours) {
        LOGGER.info("Sportsman trains " + hours + " hours");
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
