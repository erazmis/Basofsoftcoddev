// Пролезет ли кирпич со сторонами x, y, z в прямоугольное отверстие со сторонами a, b?
package com.company;

import java.util.Scanner;
import java.lang.Math;

public class Branches_4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размеры отверстия:");
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println("Введите размеры кирпича:");
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();
        int minXY;
        int minXZ;
        int maxXYXZ;
        int minXYXZ;
        int maxAB;
        int minAB;

        if (x < y) {
            minXY = x;
        } else {
            minXY = y;
        }

        if (x < z) {
            minXZ = x;
        } else {
            minXZ = z;
        }

        if (minXY > minXZ) {
            maxXYXZ = minXY;
            minXYXZ = minXZ;
        } else {
            maxXYXZ = minXZ;
            minXYXZ = minXY;
        }

        if (a < b) {
            int minAB = a;
            int maxAB = b;
        } else {
            int minAB = a;
            int maxAB = b;
        }

        if ((minXYXZ <= minAB) && (maxXYXZ <= maxAB)) {
            System.out.println("Кирпич пролезет.");
        } else {
            System.out.println("Кирпич не пролезет.");
        }
    }
}
