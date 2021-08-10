/**
 * Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке.
 * Учитывать только английские буквы.
 */

package com.epam.module_3.working_with_a_string_as_an_object_string_and_stringbuilder;

public class StringAsAnObjectStringAndStringBuilder_9 {

    public static void main(String[] args) {
        String str = "Aus der Geschichte lernen wir das wis aus der Gerschichte Nichts lernen";
        System.out.println(str);
        int capitalLetters = calculateCapitalLetters(str);
        int lowercaseLetters = calculateLowercaseLetters(str);
        System.out.println("The string contains " + capitalLetters +
                " capital letters and " + lowercaseLetters + " lowercase letters");
    }

    private static int calculateCapitalLetters(String str) {
        int capitalLetters = 0;
        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                capitalLetters++;
            }
        }

        return capitalLetters;
    }

    private static int calculateLowercaseLetters(String str) {
        int lowercaseLetters = 0;
        for (char ch : str.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                lowercaseLetters++;
            }
        }

        return lowercaseLetters;
    }
}
