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
        System.out.println("Введите чётное число:");
        int n = scan.nextInt();
        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                array[i][j] = i + 1;
            }
        }

        System.out.println("Матрица:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("  " + array[i][j]);
            }
            System.out.println(" ");
        }
    }
}
