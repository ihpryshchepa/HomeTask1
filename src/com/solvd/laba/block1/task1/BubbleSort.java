package com.solvd.laba.block1.task1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class BubbleSort {
    private static final Logger LOGGER = LogManager.getLogger(BubbleSort.class);

    void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
        LOGGER.info("Array after sort: " + Arrays.toString(array));
    }
}


