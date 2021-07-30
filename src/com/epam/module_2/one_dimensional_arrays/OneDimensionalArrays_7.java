/* Даны действительные числа a[1], a[2], ... , a[n].
Найти max(a[1] + a[2n], a[2] + a[2n - 1], ... , a[n] + a[n + 1])
 */
package com.epam.module_2.one_dimensional_arrays;

import java.util.Random;

public class OneDimensionalArrays_7 {

    private static final int SIZE = 20;

    public static void main(String[] args) {
        int[] array = new int[20];
        createArray(array);

        printArray(array);

        int max = findMaxElement(array);
        System.out.println("max(a[1] + a[2n], a[2] + a[2n - 1], ... , a[n] + a[n + 1]) = " + max +
                "\nn = " + array.length / 2);
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

    private static int findMaxElement(int[] array) {
        int max = array[1] + array[array.length - 1];

        for (int i = 1; i < array.length / 2; i++) {
            if (max < array[i] + array[array.length - 1 - i]) {
                max = array[i] + array[array.length - 1 - i];
            }
        }

        return max;
    }
}
