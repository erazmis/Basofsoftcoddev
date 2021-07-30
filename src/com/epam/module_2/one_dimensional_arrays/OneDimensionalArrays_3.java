/* Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нём
 отрицательных, положительных и нулевых элементов.
 */
package com.epam.module_2.one_dimensional_arrays;

import java.util.Random;
import java.util.Scanner;

public class OneDimensionalArrays_3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array's length:");
        int length = scan.nextInt();
        int[] array = new int[length];
        createArray(array);

        printArray(array);

        int negativeElements = calculateNegativeElements(array);
        int nullElements = calculateNullElements(array);
        int positiveElements = calculatePositiveElements(array);

        System.out.printf("\nQuantity of negative elements: %s" +
                        "\nQuantity of null elements: %s" +
                        "\nQuantity of positive elements: %s",
                negativeElements, nullElements, positiveElements);
    }

    private static void createArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(21) - 10;
        }
    }

    private static void printArray(int[] array) {
        System.out.println("Array:");

        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
    }

    private static int calculateNegativeElements(int[] array) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                count++;
            }
        }

        return count;
    }

    private static int calculateNullElements(int[] array) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                count++;
            }
        }

        return count;
    }

    private static int calculatePositiveElements(int[] array) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                count++;
            }
        }

        return count;
    }
}
