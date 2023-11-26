package com.solvd.laba.block1.task1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.Random;


public class ArrayDemo {
    static {
        System.setProperty("log4j.configurationFile", "log4j2.xml");
    }

    private static final Logger LOGGER = LogManager.getLogger(ArrayDemo.class);

    public static void main(String[] args) {
        LOGGER.info("Bubble sort");
        Random rd = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(100);
        }
        LOGGER.info("Array before sort: " + Arrays.toString(array));
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSort(array);
    }
}
