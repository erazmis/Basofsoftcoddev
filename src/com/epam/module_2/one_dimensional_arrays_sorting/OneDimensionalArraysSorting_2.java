/**
 * Даны две последовательности. Образовать из них новую последовательность чисел так, 
 * чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать. 
 */

package com.epam.module_2.one_dimensional_arrays_sorting;

import java.util.Random;
import java.util.Arrays;

public class OneDimensionalArraysSorting_2 {
	
	public static void main(String[] args) {
		Random rand = new Random();
		int[] array1 = new int[rand.nextInt(16) + 5];
		int[] array2 = new int[rand.nextInt(16) + 5];
		int[] result = new int[array1.length + array2.length];
		
		for (int i = 0; i < array1.length; i++) {
			array1[i] = rand.nextInt(30);
		}	
		
		int count;
		do {
			count = 0;
			for (int i = 1; i < array1.length; i++) {
				if (array1[i - 1] > array1[i]) {
					int buffer = array1[i];
					array1[i] = array1[i - 1];
					array1[i - 1] = buffer;
					count++;
				}
			}		
		} while (count > 0);
		
		System.out.println("First array: " + Arrays.toString(array1));

		for (int i = 0; i < array2.length; i++) {
			array2[i] = rand.nextInt(30);
		}
		
		do {
			count = 0;
			for (int i = 1; i < array2.length; i++) {
				if (array2[i - 1] > array2[i]) {
					int buffer = array2[i];
					array2[i] = array2[i - 1];
					array2[i - 1] = buffer;
					count++;
				}
			}		
		} while (count > 0);

		System.out.println("Second array: " + Arrays.toString(array2));
				
		int index1 = 0;
		int index2 = 0;
		for (int i = 0; i < result.length; i++) {
			if (index1 < array1.length && array1[index1] <= array2[index2]) {
				result[i] = array1[index1++];
			} else {
				result[i] = array2[index2++];
			}
		}

		System.out.println("Result array: " + Arrays.toString(result));
	}
} 	
