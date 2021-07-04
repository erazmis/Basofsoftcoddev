// (b + sqrt(b**2 + 4ac)) / 2a - (a**3) * c + b**-2
package com.company;

import java.util.Scanner;

public class LP2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите а: ");
        int a = scan.nextInt();
        System.out.println("Введите b: ");
        int b = scan.nextInt();
        System.out.println("Введите c: ");
        int c = scan.nextInt();
        double z;
        double bb = Math.pow(b, 2);
        double aaa = Math.pow(a, 3);
        double SquareRoot = Math.sqrt(bb + 4 * a * c);
        z = (b + SquareRoot) / 2 * a - aaa * c + 1 / bb;
        System.out.println(z);

    }
}
