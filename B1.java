// Вводятся два угла. Нужно определить, существует ли треугольник с такими углами и,
// если да, является ли он прямоугольным
package com.company;

import java.util.Scanner;

public class B1 {

    private static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);
	    int a = scan.nextInt();
	    int b = scan.nextInt();

	    if ((a > 0) && (b > 0) && ((a + b) < 180)) {
	        System.out.print("Треугольник существует. ");

	        if ((a + b) == 90) {
                System.out.print("Он прямоугольный.");

            } else {
                System.out.print("Он не прямоугольный.");
            }

        } else {
            System.out.print("Треугольник не существует.");
	    }

    }
}
