/**
 * В строке найти количество чисел.
 */

package com.epam.module_3.working_with_a_string_as_an_array_of_characters;

public class StringAsAnArrayOfCharacters_4 {

    public static void main(String[] args) {
        String str = "The first known numeral system with place value was the Mesopotamian base 60 system (c. 3400 BC) and the earliest known base 10 system dates to 3100 BC in Egypt.";
        System.out.println(str);
        int digits = calculateAmountOfNumbers(str);
        System.out.println(digits + " numbers");
    }

    private static int calculateAmountOfNumbers(String str) {
        int count = 0;

        char[] ch = str.toCharArray();

        if (ch[0] >= '0' && ch[0] <= '9') {
            count++;
        }

        for (int i = 1; i < ch.length; i++) {
            if (ch[i] >= '0' && ch[i] <= '9' && (ch[i - 1] < '0' || ch[i - 1] > '9')) {
                count++;
            }
        }

        return count;
    }
}
