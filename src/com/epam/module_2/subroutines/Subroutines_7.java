/**
 * Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9. 
 */

package com.epam.module_2.subroutines;

class Subroutines_7 {

	public static void main(String[] args) {
		int sumFactorials = 0;

		for (int i = 1; i < 10; i += 2) {
			int factorial = 1;

			for (int j = i; j > 0; j--) {
				factorial *= j;
			}

			sumFactorials += factorial;
		}

		System.out.println("Sum of factorials of odd numbers from 1 to 9 is " + sumFactorials);
	}
}
