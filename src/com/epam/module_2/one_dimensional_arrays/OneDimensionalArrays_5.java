// Даны целые числа а1 ,а2 ,..., аn. Вывести на печать только те числа, для которых а[i] > i.
package com.epam.module_2.one_dimensional_arrays;

import java.util.Random;

public class OneDimensionalArrays_5 {

    private static final int SIZE = 10;

    public static void main(String[] args) {
        int[] array = new int[SIZE];
        createArray(array);

        printArray(array);

        printByTheTask(array);
    }

    private static void createArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(11);
        }
    }

    private static void printArray(int[] array) {
        System.out.println("Array:");

        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }

        System.out.println();
    }

    private static void printByTheTask(int[] array) {
        System.out.println("Elements, that are greater, than their indexes:");

        for (int i = 0; i < array.length; i++) {
            if (array[i] > i) {
                System.out.print(" " + array[i]);
            }
        }

        System.out.println();
    }
}
