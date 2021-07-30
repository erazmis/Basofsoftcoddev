/**
 * Cоставить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
 * которое меньше максимального элемента массива, но больше всех других элементов).
 */

package com.epam.module_2.subroutines;

import java.util.Random;

class Subroutines_5 {

    private static final int SIZE = 15;

    public static void main(String[] args) {
        int[] array = new int[SIZE];
        createArray(array);

        printArray(array);

        System.out.println("Second maximum value in the array is " + secMaxValue(array));

    }

    private static void createArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(101);
        }
    }

    private static void printArray(int[] array) {
        System.out.println("Array:");

        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println();
    }

    private static int secMaxValue(int[] array) {
        int firstMax = -1;
        int secondMax = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > firstMax) {
                secondMax = firstMax;
                firstMax = array[i];
            }
            if (array[i] > secondMax && array[i] < firstMax) {
                secondMax = array[i];
            }
        }

        return secondMax;
    }
}
