/**
 * Написать программу, определяющую сумму n-значных чисел, содержащих только нечетные цифры.
 * Определить также, сколько четных цифр в найденной сумме.
 * Для решения задачи использовать декомпозицию.
 */

package com.epam.module_2.subroutines;

import java.util.Random;

public class Subroutines_16 {

    public static void main(String[] args) {
        int n = new Random().nextInt(4) + 2;
        long sum = calculateSumOfNumsWithOddDigits(n);
        int amount = amountOfEvenDigits(sum);

        System.out.printf("Sum of %s-digit numbers, containing only odd digits: %s \n" +
                "Amount of even digits in the sum: %s", n, sum, amount);
    }

    private static long calculateSumOfNumsWithOddDigits(int power) {
        long sum = 0;
        for (int i = (int) Math.pow(10, power - 1); i < Math.pow(10, power); i++) {
            String numLine = Integer.toString(i);
            boolean isAllDigitsOdd = true;
            for (char ch : numLine.toCharArray()) {
                if ((ch - '0') % 2 == 0) {
                    isAllDigitsOdd = false;
                    break;
                }
            }

            if (isAllDigitsOdd) {
                sum += i;
            }
        }

        return sum;
    }

    private static int amountOfEvenDigits(long num) {
        int amount = 0;
        String line = Long.toString(num);
        for (char ch : line.toCharArray()) {
            if (ch % 2 == 0) {
                amount++;
            }
        }

        return amount;
    }

}
