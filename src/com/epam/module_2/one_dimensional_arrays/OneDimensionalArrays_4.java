// Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
package com.epam.module_2.one_dimensional_arrays;

import java.util.Random;

public class OneDimensionalArrays_4 {

    private static final int SIZE = 10;

    public static void main(String[] args) {
        int[] array = new int[SIZE];
        createArray(array);

        printArray(array);

        int indexMin = findIndexOfMinElement(array);
        int indexMax = findIndexOfMaxElement(array);

        int buffer = array[indexMax];
        array[indexMax] = array[indexMin];
        array[indexMin] = buffer;

        printArray(array);
    }

    private static void createArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(21);
        }
    }

    private static void printArray(int[] array) {
        System.out.println("Array:");

        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }

        System.out.println();
    }

    private static int findIndexOfMinElement(int[] array) {
        int min = array[0];
        int indexMin = 0;

        for (int i = 0; i < 10; i++) {
            if (array[i] < min) {
                min = array[i];
                indexMin = i;
            }
        }

        return indexMin;
    }

    private static int findIndexOfMaxElement(int[] array) {
        int max = array[0];
        int indexMax = 0;

        for (int i = 0; i < 10; i++) {
            if (array[i] > max) {
                max = array[i];
                indexMax = i;
            }
        }

        return indexMax;
    }
}
