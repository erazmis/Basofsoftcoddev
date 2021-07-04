// введённое число - секунды. Их нужно преобразовать в формат ЧЧч ММмин ССс
package com.company;

import java.util.Scanner;

public class LP5 {

    private static Scanner scan;

    public static void main(String[] args) {
        int a, hours, min, sec;

        scan = new Scanner(System.in);

        a = scan.nextInt();

        hours = a / 3600;
        a %= 3600;

        min = a / 60;
        a %= 60;

        sec = a;

        System.out.println(hours + "ч " + min + "мин " + sec + "с");

    }
}
