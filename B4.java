package com.company;

import java.util.Scanner;
import java.lang.Math;

public class B4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размеры отверстия:");
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println("Введите размеры кирпича:");
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();
        int minxy;
        int minxz;
        int maxxyxz;
        int minxyxz;
        int maxab;
        int minab;

        if (x < y) {
            minxy = x;
        } else {
            minxy = y;
        }

        if (x < z) {
            minxz = x;
        } else {
            minxz = z;
        }

        if (minxy > minxz) {
            maxxyxz = minxy;
            minxyxz = minxz;
        } else {
            maxxyxz = minxz;
            minxyxz = minxy;
        }

        if (a < b) {
            int minab = a;
            int maxab = b;
        } else {
            int minab = a;
            int maxab = b;
        }

        if ((minxyxz <= minab) && (maxxyxz <= maxab)) {
            System.out.println("Кирпич пролезет.");
        } else {
            System.out.println("Кирпич не пролезет.");
        }
    }
}
