/* Сформировать квадратную матрицу порядка N по правилу:
a[i][j] = sin((i**2 - j**2) / N)
и подсчитать количество положительных элементов в ней.
 */
package com.epam.module_2.arrays_of_arrays;

import java.util.Scanner;

public class ArraysOfArrays_7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter even number:");
        int n = scan.nextInt();
        double[][] matrix = new double[n][n];
        createMatrix(matrix);

        printMatrix(matrix);

        printAmountOfPositiveElements(matrix);
    }

    private static void createMatrix(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Math.sin((double) (i * i - j * j) / matrix[i].length);
            }
        }
    }

    private static void printMatrix(double[][] matrix) {
        System.out.println("Мatrix:");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < 0) {
                    System.out.printf("  %.3f", matrix[i][j]);
                } else {
                    System.out.printf("   %.3f", matrix[i][j]);
                }
            }
            System.out.println();
        }
    }

    private static void printAmountOfPositiveElements(double[][] matrix) {
        int positiveElements = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > 0) {
                    positiveElements++;
                }
            }
        }

        System.out.println("Amount of positive elements: " + positiveElements);
    }
}
