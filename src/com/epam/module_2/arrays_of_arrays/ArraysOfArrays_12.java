// Отсортировать строки матрицы по возрастанию и убыванию значений элементов
package com.epam.module_2.arrays_of_arrays;

public class ArraysOfArrays_12 {

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
            for (int i = 0; i < 10; i++) {
                for (int j = 1; j < 10; j++) {
                    first = array[i][j - 1];
                    second = array[i][j];
                    if (first > second) {
                        array[i][j - 1] = second;
                        array[i][j] = first;
                        changes = true;
                    }
                }
            }
        }

        System.out.println("\nCтроки матрицы по возрастанию значений элементов:");

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("  " + array[i][j]);
            }
            System.out.println("");
        }

        changes = true;
        while (changes) {
            changes = false;
            for (int i = 0; i < 10; i++) {
                for (int j = 1; j < 10; j++) {
                    first = array[i][j - 1];
                    second = array[i][j];
                    if (first < second) {
                        array[i][j - 1] = second;
                        array[i][j] = first;
                        changes = true;
                    }
                }
            }
        }

        System.out.println("\nCтроки матрицы по убыванию значений элементов:");

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("  " + array[i][j]);
            }
            System.out.println("");
        }
    }
}
