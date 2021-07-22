/**
 * Дано  натуральное  число  A.  Написать  метод(методы)  для  формирования  массива,  элементами  которого 
 * являются цифры числа A.
 */

package com.epam.module_2.subroutines;

import java.util.Random;
import java.util.Arrays;

class Subroutines_10 {

	public static void main(String[] args) {
		Random rand = new Random();
		int a = rand.nextInt(10000001) + 100;
		
		System.out.printf("Array of numbers of %s: " + Arrays.toString(numToArray(a)), a);
	}
 
	private static char[] numToArray(int num) {
		String numLine = Integer.toString(num);
		char[] array = new char[numLine.length()];
		int i = 0;
		for (char ch : numLine.toCharArray()) {
			array[i++] = ch;
		}

		return array;
	}
}
