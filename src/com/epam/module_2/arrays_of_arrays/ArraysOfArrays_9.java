/* Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце.
Определить, какой столбец содержит максимальную сумму.
 */
package com.epam.module_2.arrays_of_arrays;

import java.util.Random;

public class ArraysOfArrays_9 {

    public static void main(String[] args) {
        Random rand = new Random();
        int[][] matrix = new int[10][10];

        System.out.print("Матрица:\n\t\t");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrix[i][j] = rand.nextInt(10);
                System.out.print("   " + matrix[i][j]);
            }
            System.out.print("\n\t\t");
        }

        System.out.print("\nCуммы:  ");
        int maxSum = 0;
        for (int i = 0; i < 10; i++) {
            int sum = 0;
            for (int j = 0; j < 10; j++) {
                sum += matrix[j][i];
            }
            System.out.print("  " + sum);
            if (maxSum < sum) {
                maxSum = sum;
            }
        }
        System.out.println("\nМаксимальная сумма: " + maxSum);
    }
}
