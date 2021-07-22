/**
 * Cоставить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число, 
 * которое меньше максимального элемента массива, но больше всех других элементов). 
 */

package com.epam.module_2.subroutines;

import java.util.Random;
import java.util.Arrays;

class Subroutines_5 {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] array = new int[10];

		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(30);
		}
		
		System.out.println("Array: " + Arrays.toString(array));
		System.out.println("Second maximum value in the array is " + secMaxValue(array));

	}

	private static int secMaxValue(int[] array) {
		int firstMax = 0;
		int secondMax = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > firstMax) {
				secondMax = firstMax;
				firstMax = array[i];
			}
		}
		
		return secondMax;
	}
}
