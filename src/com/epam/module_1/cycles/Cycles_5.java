/*Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда,
модуль которых больше или равен заданному е. Общий член ряда имеет вид
a(n) = 1/2**n + 1/3**n.
*/
package com.epam.module_1.cycles;

import java.util.Scanner;

public class Cycles_5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = 0.8333333333333333;
        System.out.println("Введите число от 0 до 0,8333333333333333:");
        double e = scan.nextDouble();
        double sum = 0;
        int i = 2;

        while (a >= e) {
            sum += a;
            a = (1.0 / Math.pow(2.0, i)) + (1.0 / Math.pow(3.0, i));
            ++i;
        }

        System.out.print("Сумма членов ряда вида a(n) = 1 / 2**n + 1 / 3**n, " +
                "которые больше либо равны  " + e + ", равна " + sum);
    }
}

