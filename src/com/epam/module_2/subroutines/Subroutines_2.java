/**
 * Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
 */

package com.epam.module_2.subroutines;

import java.util.Random;

public class Subroutines_2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int first = rand.nextInt(100);
        int second = rand.nextInt(100);
        int third = rand.nextInt(100);
        int fourth = rand.nextInt(100);

        int greatestCommonDivisor = calculateGreatestCommonDivisor(calculateGreatestCommonDivisor(first, second), calculateGreatestCommonDivisor(third, fourth));

        System.out.printf("Greatest common divisor for numbers %s, %s, %s, and %s is %s", first, second, third, fourth, greatestCommonDivisor);
    }

    public static int calculateGreatestCommonDivisor(int first, int second) {
        int buffer;
        if (first < second) {
            buffer = first;
            first = second;
            second = buffer;
        }

        while (first % second != 0) {
            buffer = first;
            first = second;
            second = buffer % second;
        }
        return second;
    }
}
