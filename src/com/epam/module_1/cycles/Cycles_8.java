// Вывести цифры, входящие в запись обоих чисел
package com.epam.module_1.cycles;

import java.util.Scanner;

public class Cycles_8 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String met = "";
        System.out.println("Введите первое число:");
        String first = scan.nextLine();
        System.out.println("Введите второе число:");
        String second = scan.nextLine();
        System.out.println("Цифры, входящие в запись обоих чисел:");

        for (char ch : first.toCharArray()) {
            if ((second.indexOf(ch) >= 0) && (met.indexOf(ch) < 0)) {
                System.out.print(ch + " ");
                met += Character.toString(ch);
            }
        }
    }
}