package com.company;

import java.util.Scanner;

public class LP4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число формата ххх.ууу:");
        double a = scan.nextDouble();
        int xxx = (int) a;
        int yyy = (int) ((a % 1) * 1000);

        System.out.println("Изменённое число формата ууу.ххх: " + yyy + "." + xxx);
    }
}
