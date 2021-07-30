// Отсортировать столбцы матрицы по возрастанию и убыванию значений элементов
package com.epam.module_2.arrays_of_arrays;

import java.util.Random;

public class ArraysOfArrays_13 {

    static int SIZE = 10;

    public static void main(String[] args) {
        int[][] matrix = new int[SIZE][SIZE];
        createMatrix(matrix);

        System.out.println("Мatrix:");
        printMatrix(matrix);

        System.out.println("Matrix with columns, sorted in ascending order:");
        printMatrix(sortColumnsAscending(matrix));

        System.out.println("Matrix with columns, sorted in discending order:");
        printMatrix(sortColumnsDiscending(matrix));
    }

    private static void createMatrix(int[][] matrix) {
        Random rand = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rand.nextInt(10);
            }
        }
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("   " + matrix[i][j]);
            }
            System.out.println();
        }
    }

    private static int[][] sortColumnsAscending(int[][] matrix) {
        int first;
        int second;
        boolean isNotSortedYet = true;
        while (isNotSortedYet) {
            isNotSortedYet = false;
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 1; j < matrix[i].length; j++) {
                    first = matrix[j - 1][i];
                    second = matrix[j][i];
                    if (first > second) {
                        matrix[j - 1][i] = second;
                        matrix[j][i] = first;
                        isNotSortedYet = true;
                    }
                }
            }
        }

        return matrix;
    }

    private static int[][] sortColumnsDiscending(int[][] matrix) {
        int first;
        int second;
        boolean isNotSortedYet = true;
        while (isNotSortedYet) {
            isNotSortedYet = false;
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 1; j < matrix[i].length; j++) {
                    first = matrix[j - 1][i];
                    second = matrix[j][i];
                    if (first < second) {
                        matrix[j - 1][i] = second;
                        matrix[j][i] = first;
                        isNotSortedYet = true;
                    }
                }
            }
        }

        return matrix;
    }
}

