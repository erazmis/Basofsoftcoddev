/* Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце.
Определить, какой столбец содержит максимальную сумму.
 */
package com.epam.module_2.arrays_of_arrays;

import java.util.Random;

public class ArraysOfArrays_9 {

    static int SIZE = 10;

    public static void main(String[] args) {
        int[][] matrix = new int[SIZE][SIZE];
        createMatrix(matrix);

        printMatrix(matrix);

        calculateSumsOfColumns(matrix);

        calculateMaxSum(matrix);
    }

    private static void createMatrix(int[][] matrix) {
        Random rand = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = rand.nextInt(10);
            }
        }
    }

    private static void printMatrix(int[][] matrix) {
        System.out.print("Мatrix:");

        for (int i = 0; i < matrix.length; i++) {
            System.out.print("\n       ");

            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("    " + matrix[i][j]);
            }
        }
    }

    private static void calculateSumsOfColumns(int[][] matrix) {
        System.out.print("\nSums:\n       ");
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[j][i];
            }
            System.out.print("   " + sum);
        }
    }

    private static void calculateMaxSum(int[][] matrix) {
        int maxSum = 0;
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[j][i];
            }
            if (maxSum < sum) {
                maxSum = sum;
            }
        }

        System.out.println("\n\nMaximal sum:  " + maxSum);
    }
}
