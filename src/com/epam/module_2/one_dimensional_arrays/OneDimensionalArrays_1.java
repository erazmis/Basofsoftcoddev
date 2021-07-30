// В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
package com.epam.module_2.one_dimensional_arrays;

import java.util.Random;
import java.util.Scanner;

public class OneDimensionalArrays_1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array's length:");
        int length = scan.nextInt();
        int[] array = new int[length];
        createArray(array);

        printArray(array);

        System.out.println("\nEnter divider:");
        int divider = scan.nextInt();

        int sum = calculateSumOfMultiples(array, divider);
        System.out.println("The sum of elements, that are multiples of " + divider + ", is equal to " + sum);
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

    private static int calculateSumOfMultiples(int[] array, int divider) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % divider == 0) {
                sum += array[i];
            }
        }

        return sum;
    }
}
