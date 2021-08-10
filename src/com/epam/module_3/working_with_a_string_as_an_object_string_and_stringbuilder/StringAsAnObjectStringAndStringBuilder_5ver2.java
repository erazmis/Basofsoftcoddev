/**
 * Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
 */

package com.epam.module_3.working_with_a_string_as_an_object_string_and_stringbuilder;

public class StringAsAnObjectStringAndStringBuilder_5ver2 {

    public static void main(String[] args) {
        String str = "aaa3gchghcba1jhvjhvkbjhvjvaaa3jhvnbvaa2bhv9aaa";
        System.out.println("String: " + str);

        int numberOfA = 0;
        if (str.contains("a")) {
            numberOfA = calculateNumberOfA(str);
        }

        System.out.println("Number of \"a\" in the string is " + numberOfA);
    }

    private static int calculateNumberOfA(String str) {
        int num = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.toCharArray()[i] == 'a') {
                num++;
            }
        }

        return num;
    }
}
