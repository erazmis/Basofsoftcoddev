/* В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
Если таких чисел несколько, то определить наименьшее из них.
 */
package com.company;

import java.util.Random;

public class OneDimensionalArrays_9ver1 {

    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[30];
        System.out.print("Массив:");

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(11);
            System.out.print(" " + array[i]);
        }

        int first;
        int second;
        boolean changes = true;
        while (changes) {
            changes = false;
            for (int i = 1; i < array.length; i++) {
                first = array[i - 1];
                second = array[i];
                if (first > second) {
                    array[i - 1] = second;
                    array[i] = first;
                    changes = true;
                }
            }
        }

        System.out.print("\nОтсортированный массив:");

        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
        int repeatingCount = 1;
        int maxRepeating = 0;
        int minRepNum = -1;
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i - 1] == array[i]) {
                ++repeatingCount;
                if (maxRepeating < repeatingCount){
                    maxRepeating = repeatingCount;
                    minRepNum = array[i];
                }
            } else {
                repeatingCount = 1;
            }
        }
        System.out.printf("\nМаксимум повторений: %s. " +
                "\nМинимальное число с максимумом повторений: %s.", maxRepeating, minRepNum);
    }
}
