// Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
package com.company;

import java.util.Random;
import java.util.Scanner;

public class ArraysOfArrays_3 {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int[][] array = new int[10][10];
        System.out.println("Матрица:");

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                array[i][j] = rand.nextInt(10);
                System.out.print("   " + array[i][j]);
            }
            System.out.println(" ");
        }

        System.out.println("Введите номер строки от 1 до 10:");
        int line = scan.nextInt();
        System.out.println(line + "-ая строка:");
        for (int i = 0; i < 10; i++) {
            System.out.print(" " + array[line - 1][i]);
        }

        System.out.println("\nВведите номер столбца от 1 до 10:");
        int column = scan.nextInt();
        System.out.println(column + "-ый столбец:");
        for (int i = 0; i < 10; i++) {
            System.out.print(" " + array[i][column - 1]);
        }
    }
}
