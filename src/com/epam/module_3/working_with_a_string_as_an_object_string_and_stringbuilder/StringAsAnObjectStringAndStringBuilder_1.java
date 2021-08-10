/*
  Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нём.
 */

package com.epam.module_3.working_with_a_string_as_an_object_string_and_stringbuilder;

public class StringAsAnObjectStringAndStringBuilder_1 {

    public static void main(String[] args) {
        String str = " 1 2  5     3   4    5     8        6      7       ";
        int maxRepeat = calculateMaxRepeatingOfSpaces(str);
        System.out.println("The largest number of conyiguous spaces in a line \"" + str + "\" is " + maxRepeat);
    }

    private static int calculateMaxRepeatingOfSpaces(String str) {
        int maxRepeat = 0;
        if (str.contains(" ")) {
            int localMaxRepeat = 1;
            for (int i = 1; i < str.length(); i++) {
                if (str.toCharArray()[i] == ' ' && str.toCharArray()[i - 1] == ' ') {
                    localMaxRepeat++;
                } else {
                    if (maxRepeat < localMaxRepeat) {
                        maxRepeat = localMaxRepeat;
                    }

                    localMaxRepeat = 1;
                }

            }
        }

        return maxRepeat;
    }
}
