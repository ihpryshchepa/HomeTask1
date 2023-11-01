package com.solvd.laba.block1.task1;

import java.util.Arrays;

public class BubbleSort {
    void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if(array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
        System.out.println("Array after sort: " + Arrays.toString(array));
    }
}


