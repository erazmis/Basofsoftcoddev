package com.company;

import java.util.Scanner;

public class LP5 {

    public static void main(String[] args) {
        int sec, hours, min, sec;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите секунды (натуральное число):");
        sec = scan.nextInt();

        hours = sec / 3600;
        sec %= 3600;

        min = sec / 60;
        sec %= 60;

        sec = sec;

        System.out.println(hours + "ч " + min + "мин " + sec + "с");
    }
}
