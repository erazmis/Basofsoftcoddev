package com.company;

import java.util.Scanner;

public class B1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первый угол: ");
        int fstarc = scan.nextInt();
        System.out.print("Введите второй угол: ");
        int sdarc = scan.nextInt();

        if ((fstarc > 0) && (sdarc > 0) && ((fstarc + sdarc) < 180)) {
            System.out.print("Треугольник существует. ");

            if ((fstarc + sdarc) == 90) {
                System.out.print("Он прямоугольный.");

            } else {
                System.out.print("Он не прямоугольный.");
            }

        } else {
            System.out.print("Треугольник не существует.");
        }
    }
}
