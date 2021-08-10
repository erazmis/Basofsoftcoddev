/**
 * Сортировка вставками. Дана последовательность чисел. Требуется переставить числа в порядке возрастания.
 * Делается это следующим образом. Пусть a1, a2, ... ai - упорядоченная по возрастанию последовательность.
 * Берётся следующее число a(i+1) и вставляется в последовательность так,
 * чтобы новая последовательность была тоже возрастающей.
 * Процесс производится до тех пор, пока все элементы от i+1 до n не будут перебраны.
 * Примечание. Место помещения очередного элемента в отсортированную часть производить с помощью двоичного поиска.
 * Двоичный поиск оформить в виде отдельной функции.
 */

package com.epam.module_2.one_dimensional_arrays_sorting;

import java.util.Random;

public class OneDimensionalArraysSorting_5 {

    private static final int SIZE = 50;

    public static void main(String[] args) {
        int[] array = new int[SIZE];
        createArray(array);

        printArray(array);

        sortArray(array);

        printArray(array);
    }

    private static void createArray(int[] array) {
        Random rand = new Random();
        for (int i = 0; i < 6; i++) {
            array[i] = rand.nextInt(3) + 2 * i;
        }

        for (int i = 6; i < array.length; i++) {
            array[i] = rand.nextInt(101);
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
        for (int i = 6; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                int element = array[i];

                int index = binarySearch(array, i);
                for (int j = i; j > index; j--) {
                    array[j] = array[j - 1];
                }
                array[index] = element;
            }
        }
    }

    private static int binarySearch(int[] array, int length) {
        int index = length / 2 + 1;
        int cut = index / 2;
        boolean isWrongIndex = true;
        while (isWrongIndex) {
            if (array[length] <= array[index] && (index == 0 || array[length] >= array[index - 1])) {
                isWrongIndex = false;
            } else {
                if (array[length] < array[index] && index >= cut) {
                    index -= cut;
                } else {
                    index += cut;
                }

                cut /= 2;
                if (cut == 0) {
                    cut = 1;
                }
            }
        }

        return index;
    }
}