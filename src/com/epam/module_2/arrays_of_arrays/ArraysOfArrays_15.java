// Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
package com.epam.module_2.arrays_of_arrays;

import java.util.Random;

public class ArraysOfArrays_15 {

    static int SIZE = 10;

    public static void main(String[] args) {
        int[][] matrix = new int[SIZE][SIZE];
        createMatrix(matrix);

        System.out.println("Matrix:");
        printMatrix(matrix);

        int maximalElement = maxElement(matrix);
        changeOddElements(matrix, maximalElement);

        System.out.println("Changed matrix:");
        printMatrix(matrix);
    }

    private static void createMatrix(int[][] matrix) {
        Random rand = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rand.nextInt(100);
            }
        }
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                if (anInt > 9) {
                    System.out.print("   " + anInt);
                } else {
                    System.out.print("    " + anInt);
                }
            }
            System.out.println();
        }
    }

    private static int maxElement(int[][] matrix) {
        int max = 0;

        for (int[] ints : matrix) {
            for (int anInt : ints) {
                if (anInt > max) {
                    max = anInt;
                }
            }
        }

        return max;
    }

    private static int[][] changeOddElements(int[][] matrix, int max) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 != 0) {
                    matrix[i][j] = max;
                }
            }
        }

        return matrix;
    }
}

