// Для каждого натурального числа от м до н вывести все делители, кроме 1 и самого числа
package com.company;

import java.util.Scanner;

public class C7 {

    private static Scanner scan;

    public static void main(String[] args) {
	    scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();

        do {
            System.out.print("\n" + m + ": ");

            for (int i = 2; i < m; i++) {

                if (m / i == (double) m / i) {
                    System.out.print(i + " ");
                }
            }
            ++m;
        } while (m != n + 1);

    }
}
