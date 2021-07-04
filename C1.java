// Вывести сумму натуральных чисел до введённого числа
package com.company;

import java.util.Scanner;

public class C1 {

    private static Scanner scan;

    public static void main(String[] args) {
	    scan = new Scanner(System.in);
	    int x = scan.nextInt();
	    int m = 0;

	    for (int i = 1; i < x; i++) {
            m += i;
        }

	    System.out.println(m);

    }
}
