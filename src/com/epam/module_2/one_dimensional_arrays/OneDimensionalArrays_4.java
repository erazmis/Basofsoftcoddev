// Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
package com.epam.module_2.one_dimensional_arrays;

import java.util.Random;

public class OneDimensionalArrays_4 {

    public static void main(String[] args) {
	    Random rand = new Random();
	    int[] array = new int[10];
        int indexMax = 10;
        int indexMin = 10;
        int max = -10;
        int min = 10;
        System.out.print("Mассив:");

        for (int i = 0; i < 10; i++) {
            array[i] = rand.nextInt(21) - 10;
            System.out.print(" " + array[i]);
            if (array[i] <= min) {
                min = array[i];
                indexMin = i;
            }
            if (array[i] >= max) {
                max = array[i];
                indexMax = i;
            }
        }
        
        array[indexMin] = max;
        array[indexMax] = min;

        System.out.print("\nНовый массив:");

        for (int i = 0; i < 10; i++) {
            System.out.print(" " + array[i]);
        }
    }
}
