/**
 * Написать метод (методы), определяющий, в каком из данных двух чисел больше цифр.
 */

package com.epam.module_2.subroutines;

import java.util.Random;

public class Subroutines_11 {

	public static void main(String[] args) {
		Random rand = new Random();
		
		int first = rand.nextInt(1899);
		int second = rand.nextInt(1899);
		
		moreNumbers(first, second);
	}

	private static void moreNumbers(int first, int second) {
		String firstLine = Integer.toString(first);
		String secondLine = Integer.toString(second);
		
		if (firstLine.length() > secondLine.length()) {
			System.out.printf("Number %s is longer, than %s", first, second);
		
		} else if (firstLine.length() < secondLine.length()) {
			System.out.printf("Number %s is longer, than %s", second, first);
		
		} else {
			System.out.printf("Numbers %s and %s have the same length", first, second);
		}
	}
}
