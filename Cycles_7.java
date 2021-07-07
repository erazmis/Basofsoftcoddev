/* Для каждого натурального числа в промежутке от m до n вывести
все делители, кроме 1 и самого числа
 */
package com.company;

import java.util.Scanner;

public class Cycles_7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите начало промежутка (натуральное число):");
        int begin = scan.nextInt();
        System.out.println("Введите конец промежутка (натуральное число):");
        int end = scan.nextInt();
        System.out.println("Список делителей чисел заданного промежутка:");

        do {
            System.out.println(begin + ": ");

            for (int i = 2; i < begin; i++) {
                if (begin / i == (double) begin / i) {
                    System.out.print(i + " ");
                }
            }
            ++begin;

        } while (begin != end + 1);
    }
}
