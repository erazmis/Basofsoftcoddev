// Сумма квадратов первых 100 чисел и произведение квадратов первых 200 чисел
package com.company;

import java.util.Scanner;
import java.math.*;

public class C3_4 {

    private static Scanner scan;

    public static void main(String[] args) {
	    scan = new Scanner(System.in);

	    int a; // выбор между суммой... и произведением...
		int t = 0; // для работы с суммой
		BigInteger ii; // для работы с m
	    BigInteger m; // для подсчёта и вывода конечного значения

	    System.out.print("Для вывода суммы квадратов первых 100 чисел введите 1. " +
                "Для вывода произведения квадратов первых 200 чисел введите 2: ");

	    a = scan.nextInt();

	    if (a == 1) {
	        for (int i = 1; i < 101; i++) {
	            t += i * i;
            }
	        System.out.print("Сумма квадратов первых 100 чисел равна " + t);

        } else {
			m = BigInteger.valueOf(1);

	        for (int i = 1; i < 201; i++) {
	        	ii = BigInteger.valueOf(i * i);
	        	m = m.multiply(ii);
            }
	        System.out.print("Произведение квадратов первых 200 чисел равно " + m);
	    }
    }
}
