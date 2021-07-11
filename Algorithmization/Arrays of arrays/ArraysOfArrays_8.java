/* В числовой матрице поменять местами два столбца любых столбца,
т. е. все элементы одного столбца поставить на соответствующие им позиции другого,
а его элементы второго переместить в первый.
Номера столбцов вводит пользователь с клавиатуры.
 */
package com.company;

import java.util.Random;
import java.util.Scanner;

public class ArraysOfArrays_8 {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int[][] array = new int[10][10];

        System.out.println("Матрица:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                array[i][j] = rand.nextInt(10);
                System.out.print("  " + array[i][j]);
            }
            System.out.println(" ");
        }

        System.out.println("Введите номер первого столбца (от 0 до 9):");
        int column1 = scan.nextInt();
        System.out.println("Введите номер второго столбца (от 0 до 9):");
        int column2 = scan.nextInt();

        for (int i = 0; i < 10; i++) {
            int first = array[i][column1];
            int second = array[i][column2];
            array[i][column1] = second;
            array[i][column2] = first;
        }

        System.out.println("Матрица с заменой столбцов:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("  " + array[i][j]);
            }
            System.out.println(" ");
        }
    }
}
