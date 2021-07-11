/* Сформировать случайную матрицу m x n, состоящую из нулей и единиц,
причем в каждом столбце число единиц равно номеру столбца.
 */
package com.epam.module_2.arrays_of_arrays;

public class ArraysOfArrays_14ver1 {

    public static void main(String[] args) {
        int n = (int) (Math.random() * 10);
        int m = (int) (Math.random() * 10) + n;
	    int[][] array = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = i + 1; j < n; j++) {
                array[i][j] = 1;
            }
        }

        System.out.println("Массив:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("  " + array[i][j]);
            }
            System.out.println("");
        }
    }
}
