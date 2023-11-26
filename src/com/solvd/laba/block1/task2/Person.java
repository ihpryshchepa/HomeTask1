package com.solvd.laba.block1.task2;

import com.solvd.laba.block1.task2.interfaces.SloganInterface;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class Person implements SloganInterface {
    private static final Logger LOGGER = LogManager.getLogger(Person.class);

    protected String name;
    protected String lastName;

    protected Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    protected abstract void printNameLastName();

    @Override
    public void saySlogan(String slogan) {
        LOGGER.info("The person slogan is - " + slogan);
    }
}
