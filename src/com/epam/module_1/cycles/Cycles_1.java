// Вычислить сумму всех натуральных чисел до введённого числа
package com.epam.module_1.cycles;

import java.util.Scanner;

public class Cycles_1 {

    public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
        System.out.println("Введите число:");
	    int x = scan.nextInt();
	    int sum = 0;

	    for (int i = 0; i <= x; i++) {
            sum += i;
        }

	    System.out.println("Сумма всех натуральных чисел до " + x + " включительно равна " + sum);

    }
}
