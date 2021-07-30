/**
 * Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д.
 * Сколько таких действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.
 */

package com.epam.module_2.subroutines;

import java.util.Scanner;

public class Subroutines_17 {

    public static void main(String[] args) {
        System.out.println("Enter a number:");
        int num = new Scanner(System.in).nextInt();

        System.out.printf("It takes %s actions to get to zero, substracting from the number the sum of its digits", calculateActionsToZero(num));
    }

    private static int calculateActionsToZero(int num) {

        String line = Integer.toString(num);
        int sum = 0;
        for (char ch : line.toCharArray()) {
            sum += ch - '0';
        }
        int actions = (num - sum) / 9 + 1;

        return actions;
    }
}
