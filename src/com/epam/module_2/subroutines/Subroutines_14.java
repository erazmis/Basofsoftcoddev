/**
 * Натуральное число, в записи которого n цифр, называется числом Армстронга,
 * если сумма его цифр, возведенных в степень n, равна самому числу.
 * Найти все числа Армстронга от 1 до k.
 * Для решения задачи использовать декомпозицию.
 */

package com.epam.module_2.subroutines;

import java.util.Random;

public class Subroutines_14 {

    public static void main(String[] args) {
        int num = new Random().nextInt(10000001);

        System.out.printf("Armstrong's numbers from 1 to %s:\n", num);
        printArmstrongsNums(num);
    }

    private static void printArmstrongsNums(int end) {
        for (int i = 1; i <= end; i++) {
            int sum = 0;
            int power = Integer.toString(i).length();
            int buffer = i;

            for (int j = 1; j <= power; j++) {
                sum += Math.pow(buffer % 10, power);
                buffer /= 10;
            }

            if (sum == i) {
                System.out.println(i);
            }
        }
    }
}
