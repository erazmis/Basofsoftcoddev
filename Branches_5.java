/* Если x будет меньше либо равен 3, будет решаться х**2 - 3х + 9.
 В противном случае будет решаться 1 / х**3 + 6.
 */
package com.company;

import java.util.Scanner;

public class Branches_5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите х. Если он будет меньше либо равен 3, будет решаться х**2 - 3х + 9. " +
                "\nВ противном случае будет решаться 1 / х**3 + 6:");
        int x = scan.nextInt();
        int squareX = x * x;

        if (x <= 3) {
            System.out.println(squareX - 3 * x + 9);
        } else {
            System.out.println(1.0 / (squareX * x + 6));
        }
    }
}
