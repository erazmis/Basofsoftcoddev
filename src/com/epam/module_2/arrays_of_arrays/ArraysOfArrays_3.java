// Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
package com.epam.module_2.arrays_of_arrays;

import java.util.Random;
import java.util.Scanner;

public class ArraysOfArrays_3 {

    static int SIZE = 10;

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] matrix = new int[SIZE][SIZE];
        createMatrix(matrix);

        printMatrix(matrix);

        printLine(matrix);

        printColumn(matrix);
    }

    private static void createMatrix(int[][] matrix) {
        Random rand = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rand.nextInt(10);
            }
        }
    }

    private static void printMatrix(int[][] matrix) {
        System.out.println("Мatrix:");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("   " + matrix[i][j]);
            }
            System.out.println();
        }
    }

    private static void printLine(int[][] matrix) {
        System.out.println("Enter line number from 1 to " + SIZE);
        int line = scan.nextInt();

        System.out.println("Line " + line);
        for (int i = 0; i < matrix[line - 1].length; i++) {
            System.out.print(" " + matrix[line - 1][i]);
        }
    }

    public static void printColumn(int[][] matrix) {
        System.out.println("\nEnter column number from 1 to " + SIZE);
        int column = scan.nextInt();

        System.out.println("Column " + column);
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(matrix[i][column - 1]);
        }
    }
}
