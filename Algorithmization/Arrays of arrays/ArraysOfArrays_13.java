// Отсортировать столбцы матрицы по возрастанию и убыванию значений элементов
package com.company;

public class ArraysOfArrays_13 {

    public static void main(String[] args) {
        int[][] array = new int[10][10];
        System.out.println("Массив:");

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                array[i][j] = (int) (Math.random() * 10);
                System.out.print("  " + array[i][j]);
            }
            System.out.println("");
        }

        int first;
        int second;
        boolean changes = true;
        while (changes) {
            changes = false;
            for (int i = 1; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    first = array[i - 1][j];
                    second = array[i][j];
                    if (first > second) {
                        array[i - 1][j] = second;
                        array[i][j] = first;
                        changes = true;
                    }
                }
            }
        }

        System.out.println("\nCтолбцы матрицы по возрастанию значений элементов:");

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("  " + array[i][j]);
            }
            System.out.println("");
        }

        changes = true;
        while (changes) {
            changes = false;
            for (int i = 1; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    first = array[i - 1][j];
                    second = array[i][j];
                    if (first < second) {
                        array[i - 1][j] = second;
                        array[i][j] = first;
                        changes = true;
                    }
                }
            }
        }

        System.out.println("\nCтолбцы матрицы по убыванию значений элементов:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("  " + array[i][j]);
            }
            System.out.println("");
        }
    }
}

