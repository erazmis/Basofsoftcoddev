/**
 * Сортировка обменами. Дана последовательность чисел.Требуется переставить числа в порядке возрастания.
 * Для этого сравниваются двa соседних числа. Если первое больше второго, то делается перестановка.
 * Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания. 
 * Составить алгоритм сортировки, подсчитывая при этом количествo перестановок.
 */

package com.epam.module_2.one_dimensional_arrays_sorting;

import java.lang.Math;
import java.util.Arrays;

public class OneDimensionalArraysSorting_4 {

	public static void main(String[] args) {
		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 10);
		}	
		System.out.println("Array: " + Arrays.toString(array));
		
		int count;
		do {
			count = 0;
			for (int i = 1; i < array.length; i++) {
				if (array[i - 1] > array[i]) {
					int buffer = array[i];
					array[i] = array[i - 1];
					array[i - 1] = buffer;
					count++;
				}
			}		
		} while (count > 0);

		System.out.println("Sorted array: " + Arrays.toString(array));
	}
}
