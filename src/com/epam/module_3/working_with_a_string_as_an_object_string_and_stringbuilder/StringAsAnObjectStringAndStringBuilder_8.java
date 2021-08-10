/**
 * Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. Случай, когда самых
 * длинных слов может быть несколько, не обрабатывать.
 */

package com.epam.module_3.working_with_a_string_as_an_object_string_and_stringbuilder;

public class StringAsAnObjectStringAndStringBuilder_8 {

    public static void main(String[] args) {
        String str = "А роза упала на лапу Азора";
        System.out.println(str);
        String longestWord = findTheLongestWord(str);
        System.out.println("The longest word in the phrase is \"" + longestWord + "\"");
    }

    private static String findTheLongestWord(String str) {
        String[] words = str.split(" ");

        int maxLength = 0;
        String longestWord = "";

        for (int i = 0; i < words.length; i++) {
            if (maxLength < words[i].length()) {
                maxLength = words[i].length();
                longestWord = words[i];
            }
        }

        return longestWord;
    }
}
