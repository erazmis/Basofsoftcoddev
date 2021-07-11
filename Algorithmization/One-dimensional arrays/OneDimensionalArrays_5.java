// Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых а[i] > i.
package com.company;

import java.util.Random;

public class OneDimensionalArrays_5 {

    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[15];
        System.out.print("Массив:");

        for (int i = 0; i < 15; i++) {
            array[i] = rand.nextInt(11);
            System.out.print(" " + array[i]);
        }

        System.out.print("\nЧисла, для которых а[i] > i:");

        for (int i = 0; i < 15; i++) {
            if (array[i] > i) {
                System.out.printf("\na[%s] - " + array[i], i);
            }
        }
    }
}
