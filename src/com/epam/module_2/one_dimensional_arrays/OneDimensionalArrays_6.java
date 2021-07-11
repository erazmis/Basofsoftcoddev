/*Задана последовательность N вещественных чисел.
Вычислить сумму чисел, порядковые номера которых являются простыми числами.
 */
package com.epam.module_2.one_dimensional_arrays;

import java.util.Random;

public class OneDimensionalArrays_6 {

    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[15];
        int sum = 0;
        System.out.print("Массив:");

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(31);
            System.out.print(" " + array[i]);

            boolean simple = true;
            for (int j = 2; j < array[i]; j++) {
                if ((array[i] % j == 0) && (array[i] != 2)) {
                    simple = false;
                    break;
                }
            }
            if (simple) {
                sum += array[i];
            }
        }
        System.out.print("\nСумма простых чисел массива равна " + sum);
    }
}
