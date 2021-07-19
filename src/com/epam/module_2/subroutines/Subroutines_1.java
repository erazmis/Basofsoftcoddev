/**
 * Написать методы для нахождения наибольшего общего делителя 
 * и наименьшего общего кратного двух натуральных чисел.
 */

package com.epam.module_2.subroutines;

import java.util.Random;

public class Subroutines_1 {

	public static void main(String[] args) {
		Random rand = new Random();

		int first = rand.nextInt(101);	
		int second = rand.nextInt(101);

		System.out.printf("Greatest common divisor for numbers %s and %s is %s, least common multiple for them is %s", first, second, euclideanAlgorithm(first, second), (first * second) / euclideanAlgorithm(first, second)); 	
	}

	public static int euclideanAlgorithm(int first, int second) {
		int buffer;

		if (first < second) {
			buffer = first;
			first = second;
			second = buffer;
		}

		while(first % second != 0) {
			buffer = first;
			first = second;
			second = buffer % second;
		}

		int greatestComDiv = second;

		return greatestComDiv;
	}
}
