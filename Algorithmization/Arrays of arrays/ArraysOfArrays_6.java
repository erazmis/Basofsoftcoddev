/* Сформировать квадратную матрицу порядка n по заданному образцу (n - чётное):
1   1   1   ...   1   1   1
0   1   1   ...   1   1   0
0   0   1   ...   1   0   0
.. ... ...  ...  ... ... ...
0   1   1   ...   1   1   0
1   1   1   ...   1   1   1
 */
package com.company;

import java.util.Scanner;

public class ArraysOfArrays_6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите чётное число:");
        int n = scan.nextInt();
        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) {
            if (i < n / 2) {
                for (int j = i; j < n - i; j++) {
                    array[i][j] = 1;
                }
            } else {
                for (int j = n - i - 1; j <= i; j++) {
                    array[i][j] = 1;
                }
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
