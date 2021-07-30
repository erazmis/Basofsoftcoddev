/* Матрицу 10x20 заполнить случайными числами от 0 до 15.
 Вывести на экран саму матрицу и номера строк, в которых число 5 встречается три и более раз.
 */
package com.epam.module_2.arrays_of_arrays;

import java.util.Random;

public class ArraysOfArrays_11 {

    public static void main(String[] args) {
        int[][] matrix = new int[10][20];
        createMatrix(matrix);

        printMatrix(matrix);

        printNumsOfLinesWithRepeatingOf5(matrix);
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
        System.out.println("Мatrix:");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("   " + matrix[i][j]);
            }
            System.out.println();
        }
    }

    private static void printNumsOfLinesWithRepeatingOf5(int[][] matrix) {
        System.out.print("Numbers (from 0) of lines, where number 5 is repeating 3 or more times:");
        for (int i = 0; i < matrix.length; i++) {
            int count = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 5) {
                    count++;
                }
            }
            if (count > 2) {
                System.out.print("  " + i);
            }
        }
    }
}
