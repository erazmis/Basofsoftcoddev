/**
 * Замените в строке все вхождения 'word' на 'letter'.
 */

package com.epam.module_3.working_with_a_string_as_an_array_of_characters;

public class StringAsAnArrayOfCharacters_2 {

    public static void main(String[] args) {
        String str = "The task of defining what constitutes a \"word\" involves determining where one word ends and another word begins—in other words, identifying word boundaries. There are several ways to determine where the word boundaries of spoken language should be placed";
        System.out.println(str);
        str = replaceWordWithLetter(str);
        System.out.println(str);
    }

    private static String replaceWordWithLetter(String string) {
        char[] ch = string.toCharArray();
        char[] result = new char[ch.length + calculateWORDs(ch) * 2];

        int difference = 0;
        for (int i = 0; i < ch.length; i++) {
            if (i < ch.length - 4 && ch[i] == 'w' && ch[i + 1] == 'o' && ch[i + 2] == 'r' && ch[i + 3] == 'd') {
                result[i + difference] = 'l';
                result[i + difference + 1] = result[i + difference + 4] = 'e';
                result[i + difference + 2] = result[i + difference + 3] = 't';
                result[i + difference + 5] = 'r';
                difference += 2;
                i += 3;
            } else {
                result[i + difference] = ch[i];
            }
        }

        return new String(result);
    }

    private static int calculateWORDs(char[] charArray) {
        int count = 0;

        for (int i = 0; i < charArray.length - 4; i++) {
            if (charArray[i] == 'w' && charArray[i + 1] == 'o' && charArray[i + 2] == 'r' && charArray[i + 3] == 'd') {
                count++;
            }
        }

        return count;
    }
}
