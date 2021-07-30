// Дана матрица. Вывести на экран все нечётные столбцы, у которых первый элемент больше последнего.
package com.epam.module_2.arrays_of_arrays;

import java.util.Random;

public class ArraysOfArrays_1 {

    static int SIZE = 10;

    public static void main(String[] args) {
        int[][] matrix = new int[SIZE][SIZE];
        createMatrix(matrix);
        printMatrix(matrix);

        oddColumns(matrix);
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
        System.out.println("Маtrix:");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("   " + matrix[i][j]);
            }
            System.out.println();
        }
    }

    private static void oddColumns(int[][] matrix) {
        System.out.println("Odd columns with he first element greater than the last:");
        for (int i = 0; i < matrix.length; i += 2) {
            if (matrix[0][i] > matrix[9][i]) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(" " + matrix[j][i]);
                }
                System.out.println("\n");
            }
        }
    }
}
