// Перевести введённые секунды в часы, минуты и секунды в формате ЧЧч ММмин ССс
package com.epam.module_1.linear_programs;

import java.util.Scanner;

public class LinearPrograms_5 {

    public static void main(String[] args) {
        int sec;
        int hours;
        int min;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите секунды (натуральное число):");
        sec = scan.nextInt();

        hours = sec / 3600;
        sec %= 3600;

        min = sec / 60;
        sec %= 60;

        System.out.println(hours + "ч " + min + "мин " + sec + "с");
    }
}
