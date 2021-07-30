/* Сформировать случайную матрицу m x n, состоящую из нулей и единиц,
причем в каждом столбце число единиц равно номеру столбца.
 */
package com.epam.module_2.arrays_of_arrays;

public class ArraysOfArrays_14ver1 {

    public static void main(String[] args) {
        int n = (int) (Math.random() * 10) + 1;
        int m = (int) (Math.random() * 10) + n;
        int[][] matrix = new int[m][n];
        createMatrix(matrix);

        printMatrix(matrix);
    }

    private static void createMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[i].length; j++) {
                matrix[i][j] = 1;
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
