/* Дана последовательность целых чисел.
Образовать новую последовательность, выбросив из исходной те члены,
которые равны минимуму последовательности.
 */
package com.epam.module_2.one_dimensional_arrays;

import java.util.Random;

public class OneDimensionalArrays_8 {

    private static final int SIZE = 20;

    public static void main(String[] args) {
        int[] array = new int[SIZE];
        createArray(array);

        printArray(array);

        int[] newArray = createArrayWithoutMinElements(array);

        printArray(newArray);
    }

    private static void createArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(10);
        }
    }

    private static void printArray(int[] array) {
        System.out.println("Array:");

        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println();
    }

    private static int findMinOfArray(int[] array) {
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }

        return min;
    }

    private static int calculateNewLength(int[] array) {
        int min = findMinOfArray(array);
        int newLength = array.length;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == min) {
                newLength--;
            }
        }

        return newLength;
    }

    private static int[] createArrayWithoutMinElements(int[] array) {
        int length = calculateNewLength(array);
        int[] newArray = new int[length];
        int index = 0;
        int min = findMinOfArray(array);

        for (int i = 0; i < array.length; i++) {
            if (array[i] != min) {
                newArray[index++] = array[i];
            }
        }

        return newArray;
    }
}
