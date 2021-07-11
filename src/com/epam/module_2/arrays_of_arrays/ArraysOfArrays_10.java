// Найти положительные элементы главной диагонали квадратной матрицы.
package com.epam.module_2.arrays_of_arrays;

import java.util.Random;

public class ArraysOfArrays_10 {

    public static void main(String[] args) {
        Random rand = new Random();
        int[][] array = new int[10][10];

        System.out.println("Матрица:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                array[i][j] = rand.nextInt(19) - 9;
                if (array[i][j] < 0){
                    System.out.print("  " + array[i][j]);
                } else{
                    System.out.print("   " + array[i][j]);
                }
            }
            System.out.println("");
        }

        System.out.println("Положительные элементы главной диагонали матрицы:");
        for (int i = 0; i < 10; i++) {
            if (array[i][i] > 0) {
                System.out.print("  " + array[i][i]);
            }
        }
    }
}
