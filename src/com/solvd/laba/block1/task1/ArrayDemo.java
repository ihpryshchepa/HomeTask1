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
        //BubbleSort
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
        //Arrays.sort(array);
    }
}
