package com.solvd.laba.block1.task1;

import com.solvd.laba.block1.task2.Main;

import java.util.Arrays;
import java.util.Random;
import java.util.logging.Logger;


public class ArrayDemo {
    static {
        System.setProperty("log4j.configurationFile", "log4j2.xml");
    }
    private static final Logger LOGGER = Logger.getLogger("ArrayDemo");

    public static void main(String[] args) {
        LOGGER.info("Hello world");
        Random rd = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(100);
        }
        System.out.println("Array before sort: " + Arrays.toString(array));

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSort(array);
    }
}
