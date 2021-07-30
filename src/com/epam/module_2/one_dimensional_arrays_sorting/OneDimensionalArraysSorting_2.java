/**
 * Даны две последовательности. Образовать из них новую последовательность чисел так,
 * чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.
 */

package com.epam.module_2.one_dimensional_arrays_sorting;

import java.util.Random;

public class OneDimensionalArraysSorting_2 {

    private static final Random rand = new Random();

    public static void main(String[] args) {
        int[] firstArray = new int[rand.nextInt(16) + 5];
        int[] secondArray = new int[rand.nextInt(16) + 5];
        int[] result = new int[firstArray.length + secondArray.length];

        System.out.println("First array:");
        createArray(firstArray);
        printArray(firstArray);

        System.out.println("Second array:");
        createArray(secondArray);
        printArray(secondArray);

        System.out.println("Result array");
        createResultArray(firstArray, secondArray, result);
        printArray(result);
    }

    private static void createArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10);
        }
        sortArray(array);
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println();
    }

    private static void sortArray(int[] array) {
        int count;
        do {
            count = 0;
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] > array[i]) {
                    int buffer = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = buffer;
                    count++;
                }
            }
        } while (count > 0);
    }

    private static void createResultArray(int[] firstArray, int[] secondArray, int[] result) {
        int indexFirst = 0;
        int indexSecond = 0;

        for (int i = 0; i < result.length; i++) {
            if (indexFirst < firstArray.length && firstArray[indexFirst] <= secondArray[indexSecond]) {
                result[i] = firstArray[indexFirst++];
            } else {
                result[i] = secondArray[indexSecond++];
            }
        }
    }
}
