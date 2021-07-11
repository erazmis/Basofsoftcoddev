/* Сформировать случайную матрицу m x n, состоящую из нулей и единиц,
причем в каждом столбце число единиц равно номеру столбца.
 */
package com.company;

import java.util.Random;

public class ArraysOfArrays_14ver2 {

    public static void main(String[] args) {
        Random rand = new Random();
        int n = (int) (Math.random() * 10) + 1;
        int m = (int) (Math.random() * 10) + n;
        int[][] array = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 1; j < n; j++) {
                array[i][j] = (int) (Math.random() * 2);
            }
        }

        for (int i = 1; i < n; i++) {
            int count = 0;
            for (int j = 0; j < m; j++) {
                if (array[j][i] == 1) {
                    count++;
                }
            }
            while (count != i) {
                int line = rand.nextInt(m);
                if (count > i) {
                    if (array[line][i] == 1) {
                        array[line][i] = 0;
                        count--;
                    }
                } else {
                    if (array[line][i] == 0) {
                        array[line][i] = 1;
                        count++;
                    }
                }
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
