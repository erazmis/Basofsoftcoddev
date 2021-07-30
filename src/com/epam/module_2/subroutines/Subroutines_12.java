/**
 * Даны натуральные числа К и N. Написать метод (методы) формирования массива А, элементами которого
 * являются числа, сумма цифр которых равна К и которые не больше N.
 */

package com.epam.module_2.subroutines;

import java.util.Arrays;
import java.util.Random;

public class Subroutines_12 {

    private static final Random rand = new Random();

    public static void main(String[] args) {
        int sum = rand.nextInt(10) + 5;
        int limit = rand.nextInt(200) + 10;

        int[] array = new int[limit];
        createArray(array, sum, limit);

        array = cutArray(array);

        System.out.printf("Sum of numbers is %s, limit is %s, array is " + Arrays.toString(array), sum, limit);
    }

    private static int[] cutArray(int[] array) {
        int length = calculateAmountOfElements(array);
        int[] bufferArray = new int[length];

        for (int i = 0; i < bufferArray.length; i++) {
            bufferArray[i] = array[i];
        }

        return bufferArray;
    }

    private static void createArray(int[] array, int sum, int limit) {
        int index = 0;
        for (int i = 0; i < limit; i++) {
            String numLine = Integer.toString(i);
            int localSum = 0;
            for (char ch : numLine.toCharArray()) {
                localSum += ch - '0';
            }

            if (localSum == sum) {
                array[index++] = i;
            }
        }
    }

    private static int calculateAmountOfElements(int[] array) {
        int amount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                break;
            }

            amount++;
        }

        return amount;
    }
}
