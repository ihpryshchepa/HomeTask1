package com.solvd.laba.block1.task1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Name {
    private static final Logger LOGGER = LogManager.getLogger(Name.class);

    public static void main(String[] args) {
        LOGGER.info("Hello! Nice to see you " + args[0] + " " + args[1]);
    }
}
