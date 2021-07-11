/* Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нём
 отрицательных, положительных и нулевых элементов.
 */
package com.epam.module_2.one_dimensional_arrays;

import java.util.Random;
import java.util.Scanner;

public class OneDimensionalArrays_3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Введите размер массива:");
        int len = scan.nextInt();
        int[] array = new int[len];
        int countNull = 0;
        int countPosit = 0;
        int countNegat = 0;
        System.out.print("Массив:");

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(21) - 10;
            System.out.print(" " + array[i]);
            if (array[i] == 0) {
                countNull++;
            } else if (array[i] > 0) {
                countPosit++;
            } else {
                countNegat++;
            }
        }
        System.out.printf("\nКоличество отрицательных элементов - %s. " +
                "\nКоличество положительных элементов - %s. " +
                "\nКоличество нулевых элементов - %s.", countNegat, countPosit, countNull);

    }
}
