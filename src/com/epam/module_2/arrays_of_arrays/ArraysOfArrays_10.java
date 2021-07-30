// Найти положительные элементы главной диагонали квадратной матрицы.
package com.epam.module_2.arrays_of_arrays;

import java.util.Random;

public class ArraysOfArrays_10 {

    static int SIZE = 10;

    public static void main(String[] args) {
        int[][] matrix = new int[SIZE][SIZE];
        createMatrix(matrix);

        printMatrix(matrix);

        calculatePositiveElements(matrix);
    }

    private static void createMatrix(int[][] matrix) {
        Random rand = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rand.nextInt(19) - 9;
            }
        }
    }

    private static void printMatrix(int[][] matrix) {
        System.out.println("Мatrix:");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < 0) {
                    System.out.print("  " + matrix[i][j]);
                } else {
                    System.out.print("   " + matrix[i][j]);
                }
            }

            System.out.println();
        }
    }

    private static void calculatePositiveElements(int[][] matrix) {
        System.out.println("Positive elements of matrix's main diagonal:");
        for (int i = 0; i < 10; i++) {
            if (matrix[i][i] > 0) {
                System.out.print("  " + matrix[i][i]);
            }
        }
    }
}
