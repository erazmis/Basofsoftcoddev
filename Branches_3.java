// Лежат ли заданные точки на одной прямой?
package com.company;

import java.util.Scanner;

public class Branches_3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите координаты точки А:");
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        System.out.println("Введите координаты точки В:");
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();
        System.out.println("Введите координаты точки С:");
        int x3 = scan.nextInt();
        int y3 = scan.nextInt();

        if ((y1 - y2) * (x2 - x3) == (x1 - x2) * (y2 - y3)) {
            System.out.println("Точки лежат на одной прямой.");
        } else {
            System.out.println("Точки не лежат на одной прямой.");
        }
    }
}
