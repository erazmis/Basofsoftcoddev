/**
 * Удалить  в  строке  все  лишние  пробелы,  то  есть  серии  подряд  идущих  пробелов  заменить  на  одиночные  пробелы.
 * Крайние пробелы в строке удалить.
 */

package com.epam.module_3.working_with_a_string_as_an_array_of_characters;

public class StringAsAnArrayOfCharacters_5 {

    public static void main(String[] args) {
        String str = "   show     must go    on!   ";
        str = removeExtraSpaces(str);
        System.out.println(str);
    }

    private static String removeExtraSpaces(String str) {
        char[] ch = str.toCharArray();
        deleteInvalidSymbols(ch);
        char[] result = new char[calculateValidSymbols(ch)];

        int index = 0;

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != '\u0000') {
                result[index] = ch[i];
                index++;
            }
        }

        return new String(result);
    }

    private static int calculateValidSymbols(char[] ch) {
        int count = 0;

        for (int i = 0; i < ch.length - 1; i++) {
            if (ch[i] != '\u0000') {
                count++;
            }
        }
        System.out.println("count = " + count);

        return count;
    }

    private static void deleteInvalidSymbols(char[] ch) {
        for (int i = 0; i < ch.length - 1; i++) {
            if (ch[i] == ' ' && ch[i + 1] == ' ') {
                ch[i] = '\u0000';
            }
        }
        if (ch[ch.length - 1] == ' ') {
            ch[ch.length - 1] = '\u0000';
        }

        int notBlankSymbols = 0;

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != ' ' && ch[i] != '\u0000') {
                notBlankSymbols++;
            }
            if (ch[i] == ' ') {
                if (notBlankSymbols == 0) {
                    ch[i] = '\u0000';
                }
                break;
            }
        }


    }
}
