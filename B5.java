package com.company;

import java.util.Scanner;

public class B5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите х. Если он будет меньше либо равен 3, будет решаться х**2 - 3х + 9. " +
                "\nВ противном случае будет решаться 1 / х**3 + 6:");
        int x = scan.nextInt();
        int xx = x * x;

        if (x <= 3) {
            System.out.println(xx - 3 * x + 9);
        } else {
            System.out.println(1.0 / (xx * x + 6));
        }
    }
}
