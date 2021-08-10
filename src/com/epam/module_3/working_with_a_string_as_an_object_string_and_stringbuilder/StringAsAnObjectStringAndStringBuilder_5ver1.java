/**
 * Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
 */

package com.epam.module_3.working_with_a_string_as_an_object_string_and_stringbuilder;

import java.util.Scanner;

public class StringAsAnObjectStringAndStringBuilder_5ver1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string:");
        String str = scan.nextLine();
        System.out.println("String: " + str);

        int numberOfA = calculateNumberOfA(str);

        System.out.println("Number of \"a\" in the string is " + numberOfA);
    }

    private static int calculateNumberOfA(String str) {
        str += "\u0000";
        String[] array = str.split("a");

        return array.length - 1;
    }
}
