package com.company;

import java.util.Scanner;

public class C8 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число:");
        String a = scan.nextLine();
        System.out.println("Введите второе число:");
        String b = scan.nextLine();
        System.out.println("Цифры, входящие в запись обоих чисел:");

        for (char ch : a.toCharArray()) {
            if (b.indexOf(ch) >= 0) {
                System.out.print(ch + " ");
            }
        }
    }
}
