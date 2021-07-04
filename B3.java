// Даны А(х1, у1), В(х2, у2), С(х3,у3). Лежат ли они на одной прямой?
// Линейная функция вида y = kx + m. Если точки лежат на одной прямой,
// то для них выполняется (y2 - y1) * (x2 - x3) = (x1 - x2)  * (y2 - y3)
package com.company;

import java.util.Scanner;

public class B3 {

    private static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();
        int x3 = scan.nextInt();
        int y3 = scan.nextInt();
        int first, second;

        first = (y1 - y2) * (x2 - x3);
        second = (x1 - x2)  * (y2 - y3);

        if (first == second) {
            System.out.println("Точки лежат на одной прямой.");
        } else {
            System.out.println("Точки не лежат на одной прямой.");
        }
    }
}
