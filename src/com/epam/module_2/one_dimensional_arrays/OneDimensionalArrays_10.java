/* Дан целочисленный массив с количеством элементов n. Сжать массив, выбросив из него каждый второй
элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
 */
package com.epam.module_2.one_dimensional_arrays;

import java.util.Random;

public class OneDimensionalArrays_10 {

    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[20];
        System.out.print("Массив:");

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(11);
            if (i % 2 != 0) {
                array[i] = 0;
            }
            System.out.print(" " + array[i]);
        }
    }
}
