package com.company;

import java.util.Scanner;

public class C1 {

    private static Scanner scan;

    public static void main(String[] args) {
	    scan = new Scanner(System.in);
        System.out.println("Введите число:");
	    int x = scan.nextInt();
	    int sum = 0;

	    for (int i = 0; i <= x; i++) {
            sum += i;
        }

	    System.out.println("Сумма всех натуральных чисел до " + x + " включительно равна " + sum);

    }
}
