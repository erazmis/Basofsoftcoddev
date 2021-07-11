// Дана матрица. Вывести на экран все нечётные столбцы, у которых первый элемент больше последнего.
package com.epam.module_2.arrays_of_arrays;

import java.util.Random;

public class ArraysOfArrays_1 {

    public static void main(String[] args) {
        Random rand = new Random();
        int[][] array = new int[10][10];
        System.out.println("Матрица:");

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                array[i][j] = rand.nextInt(10);
                System.out.print("   " + array[i][j]);
            }
            System.out.println(" ");
        }

        System.out.println("Нечётные столбцы, у которых первый элемент больше последнего:");
        for (int i = 0; i < 10; i += 2) {
            if (array[0][i] > array[9][i]) {
                for (int j = 0; j < 10; j++) {
                    System.out.print(" " + array[j][i]);
                }
                System.out.println("\n");
            }
        }
    }
}
