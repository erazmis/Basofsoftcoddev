/**
 * Пусть даны две неубывающие последовательности действительных чисел.
 * Требуется указать те места, на которые нужно вставлять элементы второй последовательности в первую
 * последовательность так, чтобы новая последовательность оставалась возрастающей.
 */

package com.epam.module_2.one_dimensional_arrays_sorting;

import java.util.Random;

public class OneDimensionalArraysSorting_7 {

    private static final int SIZE = 10;

    public static void main(String[] args) {
        int[] array1 = new int[SIZE];
        int[] array2 = new int[SIZE];

        createArray(array1);
        System.out.println("Array:");
        printArray(array1);

        createArray(array2);
        System.out.println("Array:");
        printArray(array2);

        int[] indexes = new int[SIZE];
        int count = 0;

        for (int i = 0; i < array2.length; i++) {
            for (int j = count; j < array1.length; j++) {
                if (array2[i] <= array1[j]) {
                    indexes[count] = j + count;
                    count++;
                    break;
                }
            }

        }

        if (indexes[9] == 0) {
            indexes[9] = 19;
        }

        System.out.println("Indexes:");
        printArray(indexes);
    }

    private static void createArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(i + 1) + i * i;
        }
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println();
    }
}
