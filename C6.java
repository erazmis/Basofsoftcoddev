// Соответствие между символами и их численными обозначениями
package com.company;

public class C6 {

    public static void main(String[] args) {
	    char ch;
	    
        for (int i = 1; i <= 255; i++) {
            ch = Character.forDigit(i, 10);
            System.out.println(i + " - " + ch);
        }
    }
}
