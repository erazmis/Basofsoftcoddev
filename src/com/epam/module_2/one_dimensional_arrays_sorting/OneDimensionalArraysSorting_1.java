/**
 * Заданы два одномерных массива с различным количеством элементов и натуральное число k.
 * Объединить их в один  массив,  включив  второй  массив  между  k-м  и  (k+1)-м  элементами  первого,
 * при  этом  не  используя дополнительный массив.
 */

package com.epam.module_2.one_dimensional_arrays_sorting;

import java.util.Random;
import java.util.Scanner;

public class OneDimensionalArraysSorting_1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first array's length:");
        int firstArrayLength = scan.nextInt();
        System.out.println("Enter second array's length:");
        int secondArrayLength = scan.nextInt();
        System.out.printf("Enter second array's index, after which the second array should be inserted " +
                "(index must be less than %s\n", secondArrayLength);
        int index = scan.nextInt();

        int[] firstArray = new int[firstArrayLength];
        int[] secondArray = new int[secondArrayLength];
        int[] result = new int[firstArrayLength + secondArrayLength];

        System.out.println("First array:");
        createArray(firstArray);
        printArray(firstArray);

        System.out.println("Second array:");
        createArray(secondArray);
        printArray(secondArray);

        System.out.println("Result array");
        createResultArray(firstArray, secondArray, result, index);
        printArray(result);
    }

    private static void createArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(3);
        }
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println();
    }

    private static int[] createResultArray(int[] firstArray, int[] secondArray, int[] result, int index) {
        for (int i = 0; i <= index; i++) {
            result[i] = secondArray[i];
        }

        for (int i = 0; i < firstArray.length; i++) {
            result[i + index + 1] = firstArray[i];
        }

        for (int i = index + 1; i < secondArray.length; i++) {
            result[firstArray.length + i] = secondArray[i];
        }

        return result;
    }
}
