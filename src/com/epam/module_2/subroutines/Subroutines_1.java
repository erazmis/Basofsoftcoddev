/**
 * Написать методы для нахождения наибольшего общего делителя
 * и наименьшего общего кратного двух натуральных чисел.
 */

package com.epam.module_2.subroutines;

import java.util.Random;

public class Subroutines_1 {

    public static void main(String[] args) {
        Random rand = new Random();

        int first = rand.nextInt(101);
        int second = rand.nextInt(101);

        int greatestCommonDivisor = calculateGreatestCommonDivisor(first, second);
        int leastCommonMultiple = calculateLeastCommonMultiple(first, second);

        System.out.printf("Greatest common divisor for numbers %s and %s is %s, " +
                "least common multiple for them is %s", first, second, greatestCommonDivisor, leastCommonMultiple);
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

    public static int calculateLeastCommonMultiple(int first, int second) {
        return (first * second) / calculateGreatestCommonDivisor(first, second);
    }
}
