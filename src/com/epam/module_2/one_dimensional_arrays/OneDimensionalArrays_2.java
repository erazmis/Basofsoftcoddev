/* Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены,
 большие данного Z, этим числом. Подсчитать количество замен.
 */
package com.epam.module_2.one_dimensional_arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class OneDimensionalArrays_2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter array's length:");
        int length = scan.nextInt();
        int[] array = new int[length];
        createArray(array);

        printArray(array);

        System.out.println("\nEnter the number:");
        int numZ = scan.nextInt();
        int[] changedArray;
        changedArray = Arrays.copyOf(array, length);

        changeArray(changedArray, numZ);

        printArray(changedArray);

        int replacements = calculateChanges(array, changedArray);
        System.out.println("\nQuantity of replacements: " + replacements);
    }

    private static void createArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(100);
        }
    }

    private static void printArray(int[] array) {
        System.out.println("Array:");

        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
    }

    private static int[] changeArray(int[] array, int numZ) {
        int[] changedArray = array;

        for (int i = 0; i < array.length; i++) {
            if (changedArray[i] > numZ) {
                changedArray[i] = numZ;
            }
        }

        return changedArray;
    }

    private static int calculateChanges(int[] oldArray, int[] newArray) {
        int replacements = 0;

        for (int i = 1; i < oldArray.length; i++) {
            if (oldArray[i] != newArray[i]) {
                replacements++;
            }
        }

        return replacements;
    }
}
