/**
 * Проверить, является ли заданное слово палиндромом.
 */

package com.epam.module_3.working_with_a_string_as_an_object_string_and_stringbuilder;

public class StringAsAnObjectStringAndStringBuilder_3 {

    public static void main(String[] args) {
        String str = "шалаш";
        String str1 = "xubuntu";

        System.out.printf("A word \"%s\" is%s a palindrome\n", str, isAPalindrome(str));
        System.out.printf("A word \"%s\" is%s a palindrome\n", str1, isAPalindrome(str1));
    }

    private static String isAPalindrome(String str) {
        StringBuilder builder = new StringBuilder(str);
        if (str.contentEquals(builder.reverse().toString())) {
            return "";
        } else {
            return " not";
        }
    }
}
