/**
 * Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
 * Найти и напечатать все пары «близнецов» из отрезка [n, 2n], где n - заданное натуральное число больше 2.
 * Для решения задачи использовать декомпозицию.
 */

package com.epam.module_2.subroutines;

import java.util.Scanner;

public class Subroutines_13 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number > 2:");
        int n = scan.nextInt();

        System.out.printf("Twin primes from %s to %s:\n", n, n * 2);
        twinPrimes(n);
    }

    private static void twinPrimes(int num) {
        if (num % 2 == 0) {
            ++num;
        }

        for (int i = num; i < num * 2 - 1; i += 2) {
            int count = 0;
            for (int j = 2; j < i + 2; j++) {
                if ((i % j == 0) || ((i + 2) % j) == 0) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(i + " & " + (i + 2));
            }
        }
    }
}

