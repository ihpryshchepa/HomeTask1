package com.solvd.laba.block1.task1;

import java.util.Arrays;
import java.util.Random;

public class ArrayDemo {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] array = new int[10];
        for(int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(100);
        }
        System.out.println("Array before sort: " + Arrays.toString(array));

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSort(array);
    }
}
