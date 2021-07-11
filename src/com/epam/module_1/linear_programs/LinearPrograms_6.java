/* Закрашенная область над осью х: ось ОХ - от -2 до 2, ось OY - от 0 до 4.
Закрашенная область под осью х: ось ОХ - от -4 до 4, ось OY - от -3 до 0.
Входит ли точка в закрашенную область?
 */
package com.epam.module_1.linear_programs;

import java.util.Scanner;

public class LinearPrograms_6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Закрашенная область над осью х: ось ОХ - от -2 до 2, ось OY - от 0 до 4." +
                "\nЗакрашенная область под осью х: ось ОХ - от -4 до 4, ось OY - от -3 до 0.");
        System.out.println("Введите координаты точки (х, у):");
        int x = scan.nextInt();
        int y = scan.nextInt();

        boolean xx1 = -4 <= x && x <= 4; // под осью х
        boolean yy1 = -3 <= y && y <= 0;

        boolean xx2 = -2 <= x && x <= 2; // над осью х
        boolean yy2 = 0 <= y && y <= 4;

        System.out.println((xx1 && yy1) || (xx2 && yy2));

    }
}
