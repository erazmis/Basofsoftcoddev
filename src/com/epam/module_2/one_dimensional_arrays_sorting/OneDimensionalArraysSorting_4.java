/**
 * Сортировка обменами. Дана последовательность чисел. Требуется переставить числа в порядке возрастания.
 * Для этого сравниваются двa соседних числа. Если первое больше второго, то делается перестановка.
 * Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
 * Составить алгоритм сортировки, подсчитывая при этом количествo перестановок.
 */

package com.epam.module_2.one_dimensional_arrays_sorting;

import java.util.Random;

public class OneDimensionalArraysSorting_4 {

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
        int count;
        int replaces = 0;
        do {
            count = 0;
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] > array[i]) {
                    int buffer = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = buffer;
                    count++;
                    replaces++;
                }
            }
        } while (count > 0);

        System.out.println("Quantity of replaces: " + replaces);
    }
}
