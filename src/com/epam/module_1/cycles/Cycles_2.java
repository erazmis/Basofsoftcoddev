/* Если х > 2, то у = х; если x <= 2, то у = -х
    Вводятся а и b - начало и конец промежутка - и h - длина шага
 */
package com.epam.module_1.cycles;

import java.util.Scanner;

public class Cycles_2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите начало промежутка функции:");
        int begin = scan.nextInt();
        System.out.println("Введите конец промежутка функции:");
        int end = scan.nextInt();
        System.out.println("Введите шаг в промежутке:");
        int step = scan.nextInt();

        for (int i = begin; i <= end; i += step) {
            if (i <= 2) {
                System.out.println("x = " + i + ", y = " + (-i));
            } else {
                System.out.println("x = " + i + ", y = " + i);
            }
        }
    }
}
