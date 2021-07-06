package com.company;

public class C6 {

    public static void main(String[] args) {
        char ch;

        System.out.println("ASCII:");
        for (int i = 1; i <= 255; i++) {
            ch = (char) i;
            System.out.println(i + " - " + ch);
        }
    }
}
