// Если х <= 3, то решать по уравению х**2 - 3х + 9;
// если x > 3, то решать по уравнению 1 / х**3 + 6
package com.company;

import java.util.Scanner;

public class B5 {

    private static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);
        int x = scan.nextInt();
        int xx = x * x;

        if (x <= 3) {
            System.out.println(xx - 3 * x + 9);
        } else {
            System.out.println(1.0 / (xx * x + 6));
        }

    }
}
