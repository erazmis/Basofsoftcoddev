// Определить цифры, входящие в запись обоих введённых чисел
package com.company;

import java.util.Scanner;

public class C8 {

    private static Scanner scan;

    public static void main(String[] args) {
	    scan = new Scanner(System.in);
	    String a = scan.nextLine();
        String b = scan.nextLine();

        for (char ch: a.toCharArray()) {

            if (b.indexOf(ch) >= 0) {
                    System.out.print(ch + " ");
            }

        }


    }
}
