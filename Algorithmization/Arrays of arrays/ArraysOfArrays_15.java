// Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
package com.company;

public class ArraysOfArrays_15 {

    public static void main(String[] args) {
        int n = (int) (Math.random() * 10) + 2;
        int m = (int) (Math.random() * 10) + n;
        int[][] array = new int[m][n];
        int max = 0;

        System.out.println("Матрица:");
        for (int i = 0; i < m; i++) {
            for (int j = 1; j < n; j++) {
                array[i][j] = (int) (Math.random() * 100);

                if (array[i][j] > 9){
                    System.out.print("  " + array[i][j]);
                } else {
                    System.out.print("   " + array[i][j]);
                }

                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
            System.out.println("");
        }

        System.out.println("\nНовая матрица:");
        for (int i = 0; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (array[i][j] % 2 != 0) {
                    array[i][j] = max;
                }
                if (array[i][j] > 9){
                    System.out.print("  " + array[i][j]);
                } else {
                    System.out.print("   " + array[i][j]);
                }
            }
            System.out.println("");
        }
    }
}
