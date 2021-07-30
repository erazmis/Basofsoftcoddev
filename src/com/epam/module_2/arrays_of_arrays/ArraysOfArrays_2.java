// Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
package com.epam.module_2.arrays_of_arrays;

import java.util.Random;

public class ArraysOfArrays_2 {

    static int SIZE = 10;

    public static void main(String[] args) {
        int[][] matrix = new int[SIZE][SIZE];
        createMatrix(matrix);
        printMatrix(matrix);

        printDiagonals(matrix);
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
        System.out.println("Мatrix:");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("   " + matrix[i][j]);
            }
            System.out.println();
        }
    }

    private static void printDiagonals(int[][] matrix) {
        System.out.println("Diagonals:\n");
        for (int i = 0; i < matrix.length; i++) {
            System.out.println("   ".repeat(i) + matrix[i][i]);
        }
        System.out.println();
        for (int i = matrix.length - 1; i >= 0; i--) {
            System.out.println("   ".repeat(i) + matrix[SIZE - 1 - i][i]);
        }
    }
}
