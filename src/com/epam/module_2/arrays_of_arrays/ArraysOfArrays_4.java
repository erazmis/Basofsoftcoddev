/* Сформировать квадратную матрицу порядка n по заданному образцу (n - чётное):
1    2    3   ...   n
n   n-1  n-2  ...   1
1    2    3   ...   n
n   n-1  n-2  ...   1
... ...  ...  ...  ...
n   n-1  n-2  ...   1
 */
package com.epam.module_2.arrays_of_arrays;

import java.util.Scanner;

public class ArraysOfArrays_4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter even number:");
        int n = scan.nextInt();
        int[][] matrix = new int[n][n];
        createMatrix(matrix);

        printMatrix(matrix);
    }

    private static void createMatrix(int[][] matrix) {
        System.out.println("Маtrix:");

        for (int i = 0; i < matrix.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = j + 1;
                }

            } else {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = matrix[i].length - j;
                }
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
}