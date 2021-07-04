// (sin x + cos y) / (cos x - sin y) * tg xy
package com.company;

import java.util.Scanner;

public class LP3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите х: ");
        int x = scan.nextInt();
        System.out.println("Введите у: ");
        int y = scan.nextInt();
        double z;
        double sinx = Math.sin(x);
        double siny = Math.sin(y);
        double cosx = Math.cos(x);
        double cosy = Math.cos(y);
        double tgxy = Math.tan(x * y);
        z = (sinx + cosy) / (cosx - siny) * tgxy;
        System.out.println(z);
    }
}
