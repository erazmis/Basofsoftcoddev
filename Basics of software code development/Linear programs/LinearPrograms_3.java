// Вычислить значение выражения (sin(x) + cos(y)) / (cos(x) - sin(y)) * tg(xy)
package com.company;

import java.util.Scanner;

public class LinearPrograms_3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите угол х в градусах (целое число): ");
        int x = scan.nextInt();
        System.out.println("Введите угол у в градусах (целое число): ");
        int y = scan.nextInt();
        double sinX = Math.sin(x);
        double sinY = Math.sin(y);
        double cosX = Math.cos(x);
        double cosY = Math.cos(y);
        double tgXY = Math.tan(x * y);

        System.out.println("Значение выражения (sin(x) + cos(y)) / (cos(x) - sin(y)) * tg(xy): " + ((sinX + cosY) / (cosX - sinY) * tgXY));

    }
}
