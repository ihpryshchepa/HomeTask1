package com.solvd.laba.block1.task2;

import com.solvd.laba.block1.task2.exceptions.InvalidYearsOfExperience;
import com.solvd.laba.block1.task2.interfaces.SloganInterface;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public class Trainer extends Person implements SloganInterface {
    private static final Logger LOGGER = LogManager.getLogger(Trainer.class);

    private String status;
    private int yearsOfExp;

    protected Trainer(String name, String lastName, String status) {
        super(name, lastName);
        this.status = status;
    }

    @Override
    public void printNameLastName() {
        LOGGER.info("My name is " + getName() + " " + getLastName() + " and I am trainer!");
    }

    @Override
    public void saySlogan(String slogan) {
        LOGGER.info("The trainer slogan is - " + slogan);
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

    @Override
    public String toString() {
        return "Trainer{" +
                "status='" + status + '\'' +
                ", yearsOfExp=" + yearsOfExp +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trainer trainer = (Trainer) o;
        return getYearsOfExp() == trainer.getYearsOfExp() && Objects.equals(getStatus(), trainer.getStatus());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStatus(), getYearsOfExp());
    }
}
