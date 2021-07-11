// В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
package com.company;

import java.util.Random;
import java.util.Scanner;

public class OneDimensionalArrays_1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Введите длину массива:");
        int len = scan.nextInt();
	    int [] array = new int [len];

        System.out.println("Введите делитель:");
        int divider = scan.nextInt();
        int sum = 0;
        System.out.print("Массив:");

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100);
            System.out.print(" " + array[i]);
            if (array[i] % divider == 0) {
                sum += array[i];
            }
        }
        System.out.println("\nСумма элементов, кратных " + divider + ", равна " + sum);



    }
}
