/*Дана последовательность целых чисел.
Образовать новую последовательность, выбросив из исходной те члены,
которые равны минимуму последовательности.
 */
package com.company;

import java.util.Random;

public class OneDimensionalArrays_8 {

    public static void main(String[] args) {
        Random rand = new Random();
        int[] array1 = new int[10];
        int minCount = 0;
        int min = 21;
        System.out.print("Массив:");

        for (int i = 0; i < array1.length; i++) {
            array1[i] = rand.nextInt(21);
            System.out.print(" " + array1[i]);
            if (array1[i] < min){
                min = array1[i];
                minCount++;
            }
        }

        int[] array2 = new int[array1.length - minCount];
        System.out.print("\nНовый массив:");
        int j = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != min) {
                array2[j] = array1[i];
                System.out.print(" " + array2[j]);
                j++;
            }
        }
    }
}
