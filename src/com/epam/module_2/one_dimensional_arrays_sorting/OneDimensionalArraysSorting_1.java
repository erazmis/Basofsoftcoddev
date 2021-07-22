/* Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в 
один  массив,  включив  второй  массив  между  k-м  и  (k+1)  -  м  элементами  первого,  при  этом  не  используя 
дополнительный массив. */

package com.epam.module_2.one_dimensional_arrays_sorting;

import java.util.Scanner;
import java.lang.Math;

public class OneDimensionalArraysSorting_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите размер первого массива:");
		int a = scan.nextInt();
		System.out.println("Введите размер второго массива:");
		int b = scan.nextInt();
		System.out.println("Введите индекс элемента второго массива, после которого нужно вставить первый массив (число должно быть меньше размера массива минимум на 1):");
		int k = scan.nextInt();
		int[] array1 = new int[a];
		int[] array2 = new int[b];
		int[] result = new int[a + b];

		System.out.println("Первый массив:");
		for (int i = 0; i < a; i++) {
			array1[i] = 1;              // (int) (Math.random() * 10);
			System.out.print("    " + array1[i]);
		}
		
		System.out.println("\nВторой массив:");
		for (int i = 0; i < b; i++) {
			array2[i] = 2;             //(int) (Math.random() * 10);
			System.out.print("    " + array2[i]);
		}
		
		for (int i = 0; i <= k; i++) {
			result[i] = array2[i];
		}
		
		int u = 1;
		for (int i : array1) {
			result[k + u++] = i;
		}
		
		for (int i = k + a + 1; i < b + a; i++) {
			result[i] = array2[i - a];
		}

		System.out.println("\nИтоговый массив;");
		for (int i = 0; i < a + b; i++) {
			System.out.print("    " + result[i]);
		}
	}
}
