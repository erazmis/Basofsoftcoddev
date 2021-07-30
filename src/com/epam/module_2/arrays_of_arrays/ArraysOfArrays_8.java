/* В числовой матрице поменять местами два столбца любых столбца,
т. е. все элементы одного столбца поставить на соответствующие им позиции другого,
а элементы второго переместить в первый.
Номера столбцов вводит пользователь с клавиатуры.
 */
package com.epam.module_2.arrays_of_arrays;

import java.util.Scanner;

public class ArraysOfArrays_8 {

    static int SIZE = 10;

    public static void main(String[] args) {
        int[][] matrix = new int[SIZE][SIZE];
        createMatrix(matrix);

        printMatrix(matrix);

        changeColumns(matrix);

        printMatrix(matrix);
    }

    private static void createMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = j;
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

    private static int[][] changeColumns(int[][] matrix) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Enter number of first column (from 0 to %d):\n", SIZE - 1);
        int column1 = scan.nextInt();
        System.out.printf("Enter number of second column (from 0 to %d):\n", SIZE - 1);
        int column2 = scan.nextInt();

        for (int i = 0; i < 10; i++) {
            int first = matrix[i][column1];
            int second = matrix[i][column2];
            matrix[i][column1] = second;
            matrix[i][column2] = first;
        }

        return matrix;
    }
}