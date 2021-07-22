/**
 * Задан массив D. Определить следующие суммы: D[1] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6]. 
 * Пояснение. Составить метод(методы)  для вычисления суммы трех последовательно расположенных элементов 
 * массива с номерами от k до m.
 */

package com.epam.module_2.subroutines;

import java.util.Random;

class Subroutines_8 {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] array = new int[7];
		
		System.out.print("Array:");
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(31);
			System.out.print("  " + array[i]);
		}

		System.out.printf("\nD[1] + D[2] + D[3] = %s" + 
		"\nD[3] + D[4] + D[5] = %s" +
		"\nD[4] + D[5] + D[6] = %s", 
		sumOfElems(array, 1), sumOfElems(array, 3), sumOfElems(array, 4));
	}

	private static int sumOfElems(int[] array, int begin) {
		int sum = 0;

		for (int i = begin; i < begin + 3; i++) {
			sum += array[i];
		}

		return sum;
	}
}
