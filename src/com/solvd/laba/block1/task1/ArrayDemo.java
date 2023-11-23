package com.solvd.laba.block1.task1;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ArrayDemo {
    static {
        System.setProperty("log4j.configurationFile", "log4j2.xml");
    }

    private static final Logger LOGGER = Logger.getLogger(ArrayDemo.class.getName());
    private static FileHandler fh;

    static {
        try {
            fh = new FileHandler("mylog.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        LOGGER.addHandler(fh);
        LOGGER.setLevel(Level.INFO);
        LOGGER.info("Bubble sort");
        try {
            Random rd = new Random();
            int[] array = new int[10];
            for (int i = 0; i < array.length; i++) {
                array[i] = rd.nextInt(100);
            }
            System.out.println("Array before sort: " + Arrays.toString(array));

            BubbleSort bubbleSort = new BubbleSort();
            bubbleSort.bubbleSort(array);
        } catch (Exception e) {
            LOGGER.log(Level.INFO, "Exception", e);
        }
        LOGGER.fine("done");
    }
}
