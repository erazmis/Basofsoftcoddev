/* В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
Если таких чисел несколько, то определить наименьшее из них.
 */
package com.company;

import java.util.Random;

public class OneDimensionalArrays_9ver2 {

    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[30];
        System.out.print("Массив:");

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(11);
            System.out.print(" " + array[i]);
        }

        int maxRep = 0;
        int minRepNum = -1;
        for (int control : array) {
            int localMaxRep = 0;
            int localMinRepNum = -1;
            for (int k : array) {
                if (control == k) {
                    ++localMaxRep;
                    localMinRepNum = k;
                }
            }
            if (localMaxRep > maxRep) {
                maxRep = localMaxRep;
                minRepNum = localMinRepNum;
            }
        }
        System.out.printf("\nМаксимальное количество повторений: %s." +
                "\nМинимальное число с максимальными повторениями: %s.", maxRep, minRepNum);
    }
}
