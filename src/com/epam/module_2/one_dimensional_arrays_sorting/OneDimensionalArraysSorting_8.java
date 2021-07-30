/**
 * Даны дроби p1/q1, p2/q2 ... pn/qn (q, p -  натуральные). Составить программу, которая приводит эти дроби к общему
 * знаменателю и упорядочивает их в порядке возрастания.
 */

package com.epam.module_2.one_dimensional_arrays_sorting;

import java.util.Random;

public class OneDimensionalArraysSorting_8 {

    private static final int SIZE = 10;

    public static void main(String[] args) {
        int[][] fractions = new int[SIZE][2];
        createArrayOfFractions(fractions);

        printFractions(fractions);

        int denominator = calculateLeastCommonMultiple(fractions);

        for (int i = 0; i < fractions.length; i++) {
            fractions[i][0] *= denominator / fractions[i][1];
            fractions[i][1] = denominator;
        }

        shellsSorting(fractions);

        System.out.print("Reduced to a common denominator and sorted ");
        printFractions(fractions);
    }

    private static void createArrayOfFractions(int[][] fractions) {
        for (int i = 0; i < fractions.length; i++) {
            for (int j = 0; j < fractions[i].length; j++) {
                fractions[i][j] = new Random().nextInt(11) + 10;
            }
        }
    }

    private static void printFractions(int[][] fractions) {
        System.out.println("fractions:");
        for (int i = 0; i < fractions.length; i++) {
            System.out.printf("  %s/%s,", fractions[i][0], fractions[i][1]);
        }
    }

    private static int calculateLeastCommonMultiple(int[][] matrix) {
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

            leastComMult = (leastComMult * savedNum) / greatestComDiv;
        }

        return leastComMult;
    }

    private static void shellsSorting(int[][] matrix) {
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
    }
}
