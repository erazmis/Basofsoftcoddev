/* Выяснить, являются ли введённые углы углами треугольника
и является ли этот треугольник прямоугольным
 */
package com.epam.module_1.branches;

import java.util.Scanner;

public class Branches_1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первый угол: ");
        int firstArc = scan.nextInt();
        System.out.print("Введите второй угол: ");
        int secondArc = scan.nextInt();

        if ((firstArc > 0) && (secondArc > 0) && ((firstArc + secondArc) < 180)) {
            System.out.print("Треугольник существует. ");

            if ((firstArc + secondArc) == 90) {
                System.out.print("Он прямоугольный.");

            } else {
                System.out.print("Он не прямоугольный.");
            }

        } else {
            System.out.print("Треугольник не существует.");
        }
    }
}
