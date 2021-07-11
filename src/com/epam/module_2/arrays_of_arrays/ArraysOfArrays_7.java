/* Сформировать квадратную матрицу порядка N по правилу:
a[i][j] = sin((i**2 - j**2) / N)
и подсчитать количество положительных элементов в ней.
 */
package com.epam.module_2.arrays_of_arrays;

import java.util.Scanner;

public class ArraysOfArrays_7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите чётное число:");
        int n = scan.nextInt();
        double [][] array = new double[n][n];
        int negatCount = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = Math.sin((double) (i * i - j * j) / n);
                System.out.printf("  %.3f", array[i][j]);
                if (array[i][j] < 0) {
                    negatCount++;
                }
            }
            System.out.println(" ");
        }

        System.out.println("Количество отрицательных значений: " + negatCount);
    }
}
