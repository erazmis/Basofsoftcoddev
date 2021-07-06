package com.company;

import java.util.Scanner;

public class LP6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean xx1;
        boolean yy1;
        boolean xx2;
        boolean yy2;
        int x;
        int y;

        System.out.println("Закрашенная область над осью х: ось ОХ - от -2 до 2, ось OY - от 0 до 4." +
                "\nЗакрашенная область под осью х: ось ОХ - от -4 до 4, ось OY - от -3 до 0.");
        System.out.println("Введите координаты точки (х, у):");
        x = scan.nextInt();
        y = scan.nextInt();

        xx1 = -4 <= x && x <= 4; // под осью х
        yy1 = -3 <= y && y <= 0;

        xx2 = -2 <= x && x <= 2; // над осью х
        yy2 = 0 <= y && y <= 4;

        System.out.println((xx1 && yy1) || (xx2 && yy2));

    }
}
