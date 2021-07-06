package com.company;

import java.util.Scanner;

public class C5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a;
        System.out.println("Введите число от 0 до 0,8333333333:");
        double e = scan.nextDouble();
        double sum = 0;

        while (a <= e) {
            for (int i = 1; ; i++) {
                a = (1.0 / Math.pow(2.0, i)) + (1.0 / Math.pow(3.0, i));
                sum += a;
            }
        }

        System.out.print("Сумма членов ряда вида a(n) = 1 / 2**n + 1 / 3**n, " +
                "которые больше либо равны  " + e + ", равна " + sum);
    }
}

