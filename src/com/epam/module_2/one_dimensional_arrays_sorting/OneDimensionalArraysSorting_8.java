/**
 * Даны дроби p1/q1, p2/q2 ... pn/qn (q, p -  натуральные). Составить программу, которая приводит эти дроби к общему 
 * знаменателю и упорядочивает их в порядке возрастания.
 */

import java.util.Random;

public class OneDimensionalArraysSorting_8 {

	public static void main(String[] args) {
		int[][] fractions = new int[5][2];
		
		System.out.println("Fractions:");
		for (int i = 0; i < fractions.length; i++) { 
			for (int j = 0; j < fractions[i].length; j++) {
				fractions[i][j] = new Random().nextInt(11) + 10;
			}
			System.out.printf("  %s/%s,", fractions[i][0], fractions[i][1]);
		}

		int denominator = leastCommonMultiple(fractions);
		
		for (int i = 0; i < fractions.length; i++) {
			fractions[i][0] *= (int)(denominator / fractions[i][1]);
			fractions[i][1] = denominator;
		}

		int[][] sortedFractions = shellsSorting(fractions);
		
		System.out.println("\nReduced to a common denominator and sorted fractions:");
		for (int i = 0; i < sortedFractions.length; i++) {
			System.out.printf("  %s/%s,", sortedFractions[i][0], sortedFractions[i][1]);
		}
	}
		
	private static int leastCommonMultiple(int[][] matrix) { 
		int leastComMult = matrix[0][1];
		
		for (int i = 1; i < matrix.length; i++) {
			int num = matrix[i][1];
			if (leastComMult > num) {
				int buffer = leastComMult;
				leastComMult = num;
				num = buffer;
			}
			int savedNum = num;

			int greatestComDiv = leastComMult; 
			while (num % greatestComDiv != 0) {
				int buffer = num;
				num = greatestComDiv;
				greatestComDiv = buffer % num;
			}

			leastComMult = (int) ((leastComMult * savedNum) / greatestComDiv);
		}
		
		return leastComMult;
	}

	private static int[][] shellsSorting(int[][] matrix) {
		for (int i = 1; i < matrix.length; i++) {
			if (matrix[i - 1][0] > matrix[i][0]) {
				int buffer = matrix[i - 1][0];
				matrix[i - 1][0] = matrix[i][0];
				matrix[i][0] = buffer;
				if (i > 1) {
					i -= 2;
				}
			}
		}

		return matrix;
	}
}
