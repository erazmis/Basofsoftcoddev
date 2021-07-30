/**
 * Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить eго по возрастанию.
 * Делается это следующим образом: сравниваются два соседних элемента. Если первый меньше второго,
 * то продвигаются на один элемент вперед. В противном случае производится перестановка
 * и сдвигаются на один элемент назад. Составить алгоритм этой сортировки.
 */

package com.epam.module_2.one_dimensional_arrays_sorting;

import java.util.Random;

public class OneDimensionalArraysSorting_6 {

    private static final int SIZE = 10;

    public static void main(String[] args) {
        int[] array = new int[SIZE];
        createArray(array);

        printArray(array);

        sortArray(array);

        printArray(array);
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

    private static void sortArray(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] > array[i]) {
                int buffer = array[i];
                array[i] = array[i - 1];
                array[i - 1] = buffer;
                if (i > 1) {
                    i -= 2;
                }
            }
        }
    }
}