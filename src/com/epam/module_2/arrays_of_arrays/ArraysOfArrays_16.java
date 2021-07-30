/* Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3,
..., n**2 так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между
собой. Построить такой квадрат.
 */
package com.epam.module_2.arrays_of_arrays;

import java.util.Scanner;

public class ArraysOfArrays_16 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter magic square order:");
        int exp = scan.nextInt();
        int[][] matrix;

        if (exp % 2 != 0) {
            matrix = createOddSquare(exp);
        } else if (exp % 4 == 0) {
            matrix = createEvenEvenSquare(exp);
        } else matrix = createEvenOddSquare(exp);

        printMagicSquare(matrix);

//        checkSquare(matrix);
    }

    private static int[][] createOddSquare(int exp) {
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

    public static int[][] createEvenOddSquare(int exp) {
        int[][] matrix1 = createOddSquare(exp / 2);

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

    private static int[][] createEvenEvenSquare(int exp) {
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

    private static void printMagicSquare(int[][] square) {
        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square.length; j++) {
                if (square[i][j] > 999) {
                    System.out.print(square[i][j] + " ");
                } else if (square[i][j] > 99) {
                    System.out.print(square[i][j] + "  ");
                } else if (square[i][j] > 9) {
                    System.out.print(square[i][j] + "   ");
                } else {
                    System.out.print(square[i][j] + "    ");
                }
            }
            System.out.println();
        }
    }

//    private static void checkSquare(int[][] square) {
//        int diagonal1Sum = 0;
//        int diagonal2Sum = 0;
//        int magicNum = square.length * (int) (Math.pow(square.length, 2) + 1) / 2;
//        boolean isSquareCorrect = true;
//        for (int i = 0; i < square.length; i++) {
//            diagonal1Sum += square[i][i];
//            diagonal2Sum += square[square.length - 1 - i][i];
//            int lineSum = 0;
//            int columnSum = 0;
//            for (int j = 0; j < square.length; j++) {
//                lineSum += square[i][j];
//                columnSum += square[j][i];
//            }
//            isSquareCorrect = isSquareCorrect && (lineSum == magicNum) && (columnSum == magicNum);
//        }
//
//        isSquareCorrect = isSquareCorrect && (diagonal1Sum == magicNum) && (diagonal2Sum == magicNum);
//
//        if (isSquareCorrect) {
//            System.out.println("magic square is correct");
//        } else {
//            System.out.println("magic square is incorrect");
//        }
//    }
}
