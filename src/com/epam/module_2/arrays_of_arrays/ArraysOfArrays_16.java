/* Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3,
..., n**2 так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между
собой. Построить такой квадрат.
 */
package com.epam.module_2.arrays_of_arrays;

import java.util.Scanner;

public class ArraysOfArrays_16 {

    public static int[][] oddSquare(int exp) {
        int[][] matrix = new int[exp * 2 - 1][exp * 2 - 1];
        int num = 1;
        for (int i = 0; i < exp; i++) {
            for (int j = 0; j < exp; j++) {
                matrix[exp + i - j - 1][j + i] = num;
                num++;
            }
        }

        for (int i = 0; i < exp / 2; i++) {
            for (int j = 0; j < exp * 2 - 1; j++) {
                if (matrix[i][j] != 0) {
                    matrix[i + exp][j] = matrix[i][j];
                    matrix[i][j] = 0;
                }
            }
        }

        for (int i = (exp * 2 - 1) - (exp / 2); i < exp * 2 - 1; i++) {
            for (int j = 0; j < exp * 2 - 1; j++) {
                if (matrix[i][j] != 0) {
                    matrix[i - exp][j] = matrix[i][j];
                    matrix[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < exp * 2 - 1; i++) {
            for (int j = 0; j < exp / 2; j++) {
                if (matrix[i][j] != 0) {
                    matrix[i][j + exp] = matrix[i][j];
                    matrix[i][j] = 0;
                }
            }
            for (int j = (exp * 2 - 1) - (exp / 2); j < exp * 2 - 1; j++) {
                if (matrix[i][j] != 0) {
                    matrix[i][j - exp] = matrix[i][j];
                    matrix[i][j] = 0;
                }
            }
        }

        int[][] completeMatrix = new int[exp][exp];
        for (int i = 0; i < exp; i++) {
            for (int j = 0; j < exp; j++) {
                completeMatrix[i][j] = matrix[i + exp / 2][j + exp / 2];
            }
        }
        return completeMatrix;
    }

    public static int[][] evenOddSquare(int exp) {
        int[][] matrix1 = oddSquare(exp / 2);

        int[][] matrix2 = new int[exp / 2][exp / 2];
        int[][] matrix3 = new int[exp / 2][exp / 2];
        int[][] matrix4 = new int[exp / 2][exp / 2];
        for (int i = 0; i < exp / 2; i++) {
            for (int j = 0; j < exp / 2; j++) {
                matrix2[i][j] = matrix1[i][j] + 2 * (int) Math.pow(exp / 2, 2);
                matrix3[i][j] = matrix1[i][j] + 3 * (int) Math.pow(exp / 2, 2);
                matrix4[i][j] = matrix1[i][j] + (int) Math.pow(exp / 2, 2);
            }
        }

        int first;
        int second;
        for (int i = 0; i < exp / 2; i += exp / 2 - 1) {
            first = matrix1[i][0];
            second = matrix3[i][0];
            matrix1[i][0] = second;
            matrix3[i][0] = first;
        }
        for (int i = 1; i < exp / 2 - 1; i++) {
            first = matrix1[i][1];
            second = matrix3[i][1];
            matrix1[i][1] = second;
            matrix3[i][1] = first;
        }

        int columns = (exp / 2 - 3) / 2;
        for (int i = 0; i < exp / 2; i++) {
            for (int j = exp / 2 - columns; j < exp / 2; j++) {
                first = matrix1[i][j];
                second = matrix3[i][j];
                matrix1[i][j] = second;
                matrix3[i][j] = first;
            }
            for (int j = 0; j < columns; j++) {
                first = matrix2[i][j];
                second = matrix4[i][j];
                matrix2[i][j] = second;
                matrix4[i][j] = first;
            }
        }

        int[][] matrix = new int[exp][exp];
        for (int i = 0; i < exp / 2; i++) {
            for (int j = 0; j < exp / 2; j++) {
                matrix[i][j] = matrix1[i][j];
                matrix[i + exp / 2][j] = matrix3[i][j];
                matrix[i][j + exp / 2] = matrix2[i][j];
                matrix[i + exp / 2][j + exp / 2] = matrix4[i][j];
            }
        }
        return matrix;
    }

    public static int[][] evenEvenSquare(int exp) {
        int[][] matrix = new int[exp][exp];
        int num = 1;
        for (int i = 0; i < exp; i++) {
            for (int j = 0; j < exp; j++) {
                matrix[i][j] = num;
                num++;
            }
        }

        int[][] buferMatrix = new int[exp][exp];
        int count = 0;
        for (int i = 0; i < exp; i++) {
            for (int j = count; j < exp; j += 4) {
                buferMatrix[i][j] = matrix[i][j];
                buferMatrix[i][exp - 1 - j] = matrix[i][exp - 1 - j];
            }
            count++;
            if (count == 4) {
                count = 0;
            }
        }

        for (int i = 0; i < exp; i++) {
            for (int j = 0; j < exp; j++) {
                if (buferMatrix[i][j] != 0) {
                    matrix[exp - 1 - i][exp - 1 - j] = buferMatrix[i][j];
                }
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите порядок магического квадрата:");
        int exp = scan.nextInt();
        int[][] matrix;

        if (exp % 2 != 0) {
            matrix = oddSquare(exp);
        } else if (exp % 4 == 0) {
            matrix = evenEvenSquare(exp);
        } else matrix = evenOddSquare(exp);

        for (int i = 0; i < exp; i++) {
            for (int j = 0; j < exp; j++) {
                if (matrix[i][j] > 999) {
                    System.out.print(" " + matrix[i][j]);
                } else if (matrix[i][j] > 99) {
                    System.out.print("  " + matrix[i][j]);
                } else if (matrix[i][j] > 9) {
                    System.out.print("   " + matrix[i][j]);
                } else {
                    System.out.print("    " + matrix[i][j]);
                }
            }
            System.out.println("");
        }

        int diagonal1Sum = 0;
        int diagonal2Sum = 0;
        int magicNum = exp * (int) (Math.pow(exp, 2) + 1) / 2;
        boolean correctSquare = true;
        for (int i = 0; i < exp; i++) {
            diagonal1Sum += matrix[i][i];
            diagonal2Sum += matrix[exp - 1 - i][i];
            int lineSum = 0;
            int columnSum = 0;
            for (int j = 0; j < exp; j++) {
                lineSum += matrix[i][j];
                columnSum += matrix[j][i];
            }
            correctSquare = correctSquare && lineSum == magicNum && columnSum == magicNum;
        }

        correctSquare = correctSquare && diagonal1Sum == magicNum && diagonal2Sum == magicNum;

        if (correctSquare) {
            System.out.println("magic square is correct");
        } else {
            System.out.println("magic square is incorrect");
        }
    }
}
