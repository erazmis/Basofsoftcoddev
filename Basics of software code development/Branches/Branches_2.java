// Max(min(a,b), min(c,d))
package com.company;

import java.util.Scanner;
import java.lang.Math;

public class Branches_2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите числа a, b, c, d:");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int minab;
        int mincd;

        if (a < b) {
            minab = a;
        } else {
            minab = b;
        }

        if (c < d) {
            mincd = c;
        } else {
            mincd = d;
        }

        if (minab > mincd) {
            System.out.print("Максимум минимумов (a, b) и (c, d): " + minab);
        } else {
            System.out.print("Максимум минимумов (a, b) и (c, d): " + mincd);
        }
    }
}
