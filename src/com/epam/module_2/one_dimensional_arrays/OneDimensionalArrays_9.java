/* В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
Если таких чисел несколько, то определить наименьшее из них.
 */
package com.epam.module_2.one_dimensional_arrays;

import java.util.Random;

public class OneDimensionalArrays_9 {

    private static final int SIZE = 30;

    public static void main(String[] args) {
        int[] array = new int[SIZE];
        createArray(array);

        printArray(array);

        int minElementWithMaxRepeating = findMinElementWithMaxRepeating(array);

        System.out.println("The minimum element of the array with maximum repeating is " + minElementWithMaxRepeating);
    }

    private static void createArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(5);
        }
    }

    private static void printArray(int[] array) {
        System.out.println("Array:");

        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println();
    }

    private static int findMinElementWithMaxRepeating(int[] array) {
        int maxRepeating = 1;
        int minRepeatingElement = array[0];

        for (int i = 0; i < array.length; i++) {
            int localMaxRepeating = 0;

            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    localMaxRepeating++;
                }
            }

            if (maxRepeating < localMaxRepeating) {
                maxRepeating = localMaxRepeating;
                minRepeatingElement = array[i];
            } else if (maxRepeating == localMaxRepeating && minRepeatingElement > array[i]) {
                minRepeatingElement = array[i];
            }
        }

        return minRepeatingElement;
    }
}
