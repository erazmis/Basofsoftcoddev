package com.company;

import java.util.Scanner;

public class B3 {

    private static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);
        System.out.println("Введите координаты точки А:");
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        System.out.println("Введите координаты точки В:");
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();
        System.out.println("Введите координаты точки С:");
        int x3 = scan.nextInt();
        int y3 = scan.nextInt();

        int first = (y1 - y2) * (x2 - x3); //Чтоб не загромождать условие в ветвлении
        int second = (x1 - x2) * (y2 - y3);
        /* Если точки лежат на одной прямой, то они принадлежат графику линейной функции
        вида y = kx + m и для них выполняется (y2 - y1) * (x2 - x3) = (x1 - x2)  * (y2 - y3)
         */

        if (first == second) {
            System.out.println("Точки лежат на одной прямой.");
        } else {
            System.out.println("Точки не лежат на одной прямой.");
        }
    }
}
