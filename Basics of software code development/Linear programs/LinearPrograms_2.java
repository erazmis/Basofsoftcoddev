// Вычислить значение выражения (b + sqrt(b**2 + 4ac)) / 2a - (a**3) * c + b**-2
package com.company;

import java.util.Scanner;

public class LinearPrograms_2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите а: ");
        int a = scan.nextInt();
        System.out.println("Введите b: ");
        int b = scan.nextInt();
        System.out.println("Введите c: ");
        int c = scan.nextInt();
        double squareB = Math.pow(b, 2);
        double cubeA = Math.pow(a, 3);
        double squareRoot = Math.sqrt(squareB + 4 * a * c);

        double z = (b + squareRoot) / 2 * a - cubeA * c + 1 / squareB;
        System.out.println("Значение выражения (b + sqrt(b**2 + 4ac)) / 2a - (a**3) * c + b**-2: " + z);
    }
}
