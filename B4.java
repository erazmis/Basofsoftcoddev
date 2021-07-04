// даны размеры А и В отверстия и х, у, z кирпича. Пролезет ли кирпич?
package com.company;

import java.util.Scanner;
import java.lang.Math;

public class B4 {

    private static Scanner scan;

    public static void main(String[] args) {
	    scan = new Scanner(System.in);
	    int A = scan.nextInt();
	    int B = scan.nextInt();
	    int x = scan.nextInt();
	    int y = scan.nextInt();
	    int z = scan.nextInt();
	    int a, b, xx, yy;

	    x = Math.min(x, y); // Две наименьшие стороны кирпича
	    y = Math.min(y, z);

	    xx = Math.min(x, y); // Меньшая сторона из двух наименьших
	    yy = Math.max(x, y); // Большая сторона из двух наименьших

	    a = Math.min(A, B);
	    b = Math.max(A, B);

	    if ((x <= a) && (y <= b)) {
	        System.out.println("Кирпич пролезет.");
        } else {
            System.out.println("Кирпич не пролезет.");
        }
    }
}
