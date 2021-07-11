/* Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены,
 большие данного Z, этим числом. Подсчитать количество замен.
 */
package com.epam.module_2.one_dimensional_arrays;

import java.util.Random;
import java.util.Scanner;

public class OneDimensionalArrays_2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Введите длину массива:");
        int len = scan.nextInt();
        int [] array = new int [len];

        System.out.println("Введите число:");
        int numZ = scan.nextInt();

        int replacements = 0;
        System.out.print("Массив:");

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(101);
            System.out.print(" " + array[i]);
            if (array[i] > numZ) {
                array[i] = numZ;
                ++replacements;
            }
        }

        System.out.print("\nИзменённый массив:");

        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println("\nКоличество замен: " + replacements);
    }
}
