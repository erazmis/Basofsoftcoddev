/* Сформировать квадратную матрицу порядка n по заданному образцу (n - чётное):
1   1   1   ...   1   1   1
2   2   2   ...   2   2   0
3   3   3   ...   3   0   0
.. ... ...  ...  ... ... ...
n   0   0   ...   0   0   0
 */
package com.epam.module_2.arrays_of_arrays;

import java.util.Scanner;

public class ArraysOfArrays_5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter even number:");
        int n = scan.nextInt();
        int[][] matrix = new int[n][n];
        createMatrix(matrix);

        printMatrix(matrix);
    }

    private static void createMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length - i; j++) {
                matrix[i][j] = i + 1;
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