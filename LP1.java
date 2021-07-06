package com.company;

import java.util.Scanner;

public class LP1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите целое число a: ");
        int a = scan.nextInt();
        System.out.print("Введите целое число b: ");
        int b = scan.nextInt();
        System.out.print("Введите целое число c: ");
        int c = scan.nextInt();

        double z = ((a - 3) * (double) b / 2) + c;
        System.out.println("Значение функции ((a - 3) * b / 2) + c: " + z);
    }
}
