/* Задана последовательность N вещественных чисел.
Вычислить сумму чисел, порядковые номера которых являются простыми числами.
 */
package com.epam.module_2.one_dimensional_arrays;

public class OneDimensionalArrays_6 {

    private static final int SIZE = 15;

    public static void main(String[] args) {
        double[] array = new double[SIZE];
        createArray(array);

        printArray(array);

        double sum = calculateSumOfSimpleIndexElements(array);

        System.out.printf("Sum of elements, that have simple indexes, equals to %.5f", sum);
    }

    private static void createArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random() * 100;
        }
    }

    private static void printArray(double[] array) {
        System.out.println("Array:");

        for (int i = 0; i < array.length; i++) {
            System.out.printf(" %.5f", array[i]);
        }

        System.out.println();
    }

    private static boolean isSimple(int num) {
        boolean isSimple = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isSimple = false;
                break;
            }
        }

        return isSimple;
    }

    private static double calculateSumOfSimpleIndexElements(double[] array) {
        double sum = 0;

        for (int i = 1; i < array.length; i++) {
            if (isSimple(i)) {
                sum += array[i];
            }
        }

        return sum;
    }
}
