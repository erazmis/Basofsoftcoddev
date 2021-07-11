/* Даны действительные числа a[1], a[2], ... , a[n].
Найти max(a[1] + a[2n], a[2] + a[2n - 1], ... , a[n] + a[n + 1])
 */
package com.epam.module_2.one_dimensional_arrays;

import java.util.Random;

public class OneDimensionalArrays_7 {

    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[20];
        System.out.print("Исходный массив:");

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(21);
            System.out.print(" " + array[i]);
        }

        int[] array1 = new int[10];
        System.out.print("\nМассив, сложенный вдвое:");
        int j = 19;

        for (int i = 0; i < 10; i++) {
            array1[i] = array[i] + array[j];
            System.out.print(" " + array1[i]);
            j--;
        }

        int max = -1;
        for (int i = 0; i < 10; i++) {
            if (array1[i] > max) {
                max = array1[i];
            }
        }
        System.out.print("\nМаксимум сложенного вдвое массива: " + max);
    }
}
