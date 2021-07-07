// вывести на экран соответствие между символами и их численными обозначениями в памяти компьтера
package com.company;

public class Cycles_6 {

    public static void main(String[] args) {
        char ch;

        System.out.println("ASCII:");
        for (int i = 1; i <= 255; i++) {
            ch = (char) i;
            System.out.println(ch + " - " + i);
        }
    }
}
