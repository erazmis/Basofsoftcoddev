/**
 * Даны натуральные числа К и N. Написать метод (методы) формирования массива А, элементами которого 
 * являются числа, сумма цифр которых равна К и которые не больше N. 
 */

package com.epam.module_2.subroutines;

import java.util.Random;
import java.util.Arrays;

public class Subroutines_12 {

	private static Random rand;

	public static void main(String[] args) {
		rand = new Random();
		int n = rand.nextInt(101) + 1;
		int k = rand.nextInt(101) + n;

		int[] array = arrayA(k, n);
		
		int sum = 0;
		boolean limitOrLess = true;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
			if (n < array[i]) {
				limitOrLess = false;
			}
		}
		System.out.printf("Sum of numbers is %s, limit is %s, array is " + Arrays.toString(array), k, n);
	}

	public static int[] arrayA(int sum, int limit) {
		rand = new Random();
		int[] array = new int[100 + limit];
		int numCount = 0;
		int bufferSum = 0;	
		for (int i = 1; i < array.length; i++) {
			if (sum >= 0) {
				bufferSum = sum;
			}

			sum -= array[i - 1];
			
			if (sum > 0) {
				array[i] = rand.nextInt(limit);
				numCount++;
			}
		}
		array[numCount] = bufferSum;
		
		int[] result = new int[numCount];
		int i = 0;
		while (array[i + 1] > 0) {
			result[i] = array[i + 1];
			i++;
		}

		return result;
	}
}
