/* Матрицу 10x20 заполнить случайными числами от 0 до 15.
 Вывести на экран саму матрицу и номера строк, в которых число 5 встречается три и более раз.
 */
package com.company;

import java.util.Random;

public class ArraysOfArrays_11 {

    public static void main(String[] args) {
        Random rand = new Random();
        int[][] array = new int[10][20];
        System.out.println("Матрица:");

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                array[i][j] = rand.nextInt(16);
                if (array[i][j] > 9) {
                    System.out.print("  " + array[i][j]);
                } else {
                    System.out.print("   " + array[i][j]);
                }
            }
            System.out.println("");
        }

        System.out.println("Номера строк, в которых число 5 встречается три и более раз:");
        for (int i = 0; i < 10; i++) {
            int count = 0;
            for (int j = 0; j < 20; j++) {
                if (array[i][j] == 5) {
                    count++;
                }
            }
            if (count > 2) {
                System.out.print("  " + i);
            }
        }
    }
}
