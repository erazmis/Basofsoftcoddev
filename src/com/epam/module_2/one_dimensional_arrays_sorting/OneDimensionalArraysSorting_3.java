/**
 * Сортировка выбором. Дана последовательность чисел. Требуется переставить элементы так,
 * чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
 * элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
 * повторяется. Написать алгоритм сортировки выбором.
*/

import java.lang.Math;
import java.util.Arrays;

public class OneDimensionalArraysSorting_3 {
	public static void main(String[] args) {
		int[] array = new int[10];

		System.out.println("Array:");
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 10);
		}
		
		System.out.println(Arrays.toString(array));

		System.out.println("\nSorted array:");
		for (int i = 0; i < array.length; i++) {
			int max = -1;
			int maxIndex = 0; 
			for (int j = i; j < array.length; j++) {
				if (max < array[j]) {
					max = array[j];
					maxIndex = j;
				}
			}
			if (maxIndex != i) {
				int replacer = array[i];
				array[i] = array[maxIndex];
				array[maxIndex] = replacer;
			}

		}
		System.out.println(Arrays.toString(array));
	}
 }
