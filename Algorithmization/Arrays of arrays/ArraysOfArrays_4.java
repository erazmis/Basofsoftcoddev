/* Сформировать квадратную матрицу порядка n по заданному образцу (n - чётное):
1    2    3   ...   n
n   n-1  n-2  ...   1
1    2    3   ...   n
n   n-1  n-2  ...   1
... ...  ...  ...  ...
n   n-1  n-2  ...   1
 */
package com.company;

import java.util.Scanner;

public class ArraysOfArrays_4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите чётное число:");
        int n = scan.nextInt();
        int[][] array = new int[n][n];
        System.out.println("Матрица:");

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    array [i][j] = j + 1;
                    System.out.print("   " + array[i][j]);
                }
                System.out.println(" ");

            } else {
                for (int j = n - 1; j > -1; j--) {
                    array[i][j] = j + 1;
                    System.out.print("   " + array[i][j]);
                }
                System.out.println(" ");
            }
        }
    }
}
