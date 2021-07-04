// Найти  max{min(a, b), min(c, d)}
// Если я правильно поняла задачу, то не понимаю, зачем тут ветвления и разные скобки для max & min

package com.company;

import java.util.Scanner;
import java.lang.Math;

public class B2 {

    private static Scanner scan;

    public static void main(String[] args) {
	    scan = new Scanner(System.in);
	    int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int ab, cd;

        ab = Math.min(a, b);
        cd = Math.min(c, d);

        System.out.println(Math.max(ab, cd));
    }
}
/* public static void main(String[] args) {
	    scan = new Scanner(System.in);
	    int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int ab, cd;

        if (a < b) {
            ab = a;
        } else {
            ab = b;

        if (c < d) {
            cd = c;
        } else {
            cd = d;

        if (ab > cd) {
            System.out.print(ab);
        } else {
            System.out.print(cd);
    }

 */