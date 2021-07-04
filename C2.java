/* Если х > 2, то у = х; если x <= 2, то у = -х
    Вводятся а и b - начало и конец промежутка - и h - длина шага
 */
package com.company;

import java.util.Scanner;

public class C2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int h = scan.nextInt();
        int x, y;

        for (int i = a; i <= b; i += h) {
            if (i <= 2) {
                System.out.println("x = " + i + ", y = " + (-i));
            } else {
                System.out.println("x = " + i + ", y = " + i);
            }
        }
    }
}
