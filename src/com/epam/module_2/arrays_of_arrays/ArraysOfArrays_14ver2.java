/* Сформировать случайную матрицу m x n, состоящую из нулей и единиц,
причем в каждом столбце число единиц равно номеру столбца.
 */
package com.epam.module_2.arrays_of_arrays;

import java.util.Random;

public class ArraysOfArrays_14ver2 {

    public static void main(String[] args) {
        int n = (int) (Math.random() * 10) + 1;
        int m = (int) (Math.random() * 10) + n;
        int[][] matrix = new int[m][n];
        createMatrix(matrix);

        printMatrix(correctMatrix(matrix));
    }

    private static void createMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 1; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 2);
            }
        }
    }

    private static int[][] correctMatrix(int[][] matrix) {
        for (int i = 0; i < matrix[0].length; i++) {
            int count = 0;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] == 1) {
                    count++;
                }
            }

            while (count != i + 1) {
                int line = new Random().nextInt(matrix[0].length);
                if (count > i) {
                    if (matrix[line][i] == 1) {
                        matrix[line][i] = 0;
                        count--;
                    }
                } else {
                    if (matrix[line][i] == 0) {
                        matrix[line][i] = 1;
                        count++;
                    }
                }
            }
        }

        return matrix;
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
