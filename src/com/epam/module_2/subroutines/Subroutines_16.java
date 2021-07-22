/**
 * Написать  программу,  определяющую  сумму  n-значных  чисел,  содержащих  только  нечетные  цифры. 
 * Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
 */

package com.epam.module_2.subroutines;

import java.util.Random;

public class Subroutines_16 {

	public static void main(String[] args) {
		int n = new Random().nextInt(4) + 2;
		long sum = sumOddDigits(n);
		System.out.printf("Sum of %s-digit numbers, containing only odd digits: %s \n" +
				"Quantity of even digits in the sum: %s", 
				n, sum, quantEvenDigits(sum));
	}

	private static long sumOddDigits(int power) {
		long sum = 0;
		for (int i = (int)Math.pow(10, power - 1); i < Math.pow(10, power); i++) {
			String line = Integer.toString(i);
			boolean allOdd = true;
			for (char ch : line.toCharArray()) {
				if ((ch - '0') % 2 == 0) {
					allOdd = false;
				}
			}

			if (allOdd) {
				sum += i;
			}
		}

		return sum;
	}

	private static int quantEvenDigits(long num) {
		int sum = 0;
		String line = Long.toString(num);
		for (char ch : line.toCharArray()) {
			if (ch % 2 == 0) {
				sum += ch - '0';
			}
		}

		return sum;
	}

}
