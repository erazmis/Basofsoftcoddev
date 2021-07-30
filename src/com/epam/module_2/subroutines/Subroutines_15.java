/**
 * Найти  все  натуральные  n-значные  числа,  цифры  в  которых  образуют  строго  возрастающую
 * последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.
 */

package com.epam.module_2.subroutines;

import java.util.Random;

public class Subroutines_15 {

    public static void main(String[] args) {
        int n = new Random().nextInt(7) + 2;

        System.out.println(n + "-digit numbers, in which digits form an ascending sequence:");
        printNumAscenSeq(n);
    }

    private static void printNumAscenSeq(int power) {
        for (int i = (int) Math.pow(10, power - 1); i < Math.pow(10, power); i++) {
            String line = Integer.toString(i);
            boolean ascending = true;
            int buffer = 0;
            for (char ch : line.toCharArray()) {
                if (buffer >= ch - '0') {
                    ascending = false;

                }
                buffer = ch - '0';
            }

            if (ascending) {
                System.out.println(i);
            }
        }
    }
}
