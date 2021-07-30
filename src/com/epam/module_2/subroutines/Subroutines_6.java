/**
 * Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
 */

package com.epam.module_2.subroutines;

import java.util.Random;

class Subroutines_6 {

    public static void main(String[] args) {
        Random rand = new Random();
        int a = rand.nextInt(101);
        int b = rand.nextInt(101);
        int c = rand.nextInt(101);

        String answer = coprime(a, b, c);
        System.out.printf("Numbers %s, %s, %s are %scoprime", a, b, c, answer);
    }

    private static String coprime(int a, int b, int c) {

        if (greatestCommonDivisor(greatestCommonDivisor(a, b), c) == 1) {
            return "";
        } else {
            return "not ";
        }
    }

    public static int greatestCommonDivisor(int first, int second) {
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
