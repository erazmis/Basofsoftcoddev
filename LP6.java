// если точка в закрашенной области - true, если нет - false
package com.company;

import java.util.Scanner;

public class LP6 {

    private static Scanner scan;

    public static void main(String[] args) {
        boolean xx1, yy1, xx2, yy2;
        int x, y;

        scan = new Scanner(System.in);

        x = scan.nextInt();
        y = scan.nextInt();

        xx1 = -4 <= x && x <= 4; // под осью х
        yy1 = -3 <= y && y <= 0;

        xx2 = -2 <= x && x <= 2; // над осью х
        yy2 = 0 <= y && y <= 4;

	    System.out.println((xx1 && yy1) || (xx2 && yy2));

    }
}
