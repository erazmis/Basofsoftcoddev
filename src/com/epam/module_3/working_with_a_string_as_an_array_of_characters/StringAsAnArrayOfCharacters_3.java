/**
 * В строке найти количество цифр.
 */

package com.epam.module_3.working_with_a_string_as_an_array_of_characters;

public class StringAsAnArrayOfCharacters_3 {

    public static void main(String[] args) {
        String str = "The first known numeral system with place value was the Mesopotamian base 60 system (c.3400 BC) and the earliest known base 10 system dates to 3100 BC in Egypt.";
        System.out.println(str);
        int digits = calculateAmountOfDigits(str);
        System.out.println(digits + " digits");
    }

    private static int calculateAmountOfDigits(String str) {
        int count = 0;

        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                count++;
            }
        }

        return count;
    }
}
