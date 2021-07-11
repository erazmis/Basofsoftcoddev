// Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
package com.company;

import java.util.Random;

public class ArraysOfArrays_2 {

    public static void main(String[] args) {
        Random rand = new Random();
        int[][] array = new int[10][10];
        System.out.println("Матрица:");

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                array[i][j] = rand.nextInt(10);
                System.out.print("   " + array[i][j]);
            }
            System.out.println(" ");
        }

        System.out.println("Диагонали:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i][i]);
        }
        System.out.println(" ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[9 - i][i]);
        }
    }
}
