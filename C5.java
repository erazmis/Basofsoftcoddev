// Общий член ряда - a(n) = 1 / 2**n + 1 / 3**n.
// Найти сумму тех членов ряда, модуль которых больше либо равен заданому е
package com.company;

import java.util.Scanner;
import java.math.*;

public class C5 {

    private static Scanner scan;

    public static void main(String[] args) {
	    scan = new Scanner(System.in);
	    BigDecimal a;
		BigDecimal e = scan.nextBigDecimal();
	    BigDecimal m = BigDecimal.valueOf(0);

	    for (int i = 1; ; i++) {
	        a = BigDecimal.valueOf((1.0 / Math.pow(2.0, i)) + (1.0 / Math.pow(3.0, i)));

	        if (a.compareTo(e) > 0) {
	            m = m.add(a);
            } else
	            break;

        }
	    System.out.print(m);

    }
}
