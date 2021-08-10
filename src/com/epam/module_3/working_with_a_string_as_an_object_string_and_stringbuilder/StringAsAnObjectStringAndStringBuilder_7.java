/**
 * Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы.
 * Например, если было введено "abc cde def", то должно быть выведено "abcdef".
 */

package com.epam.module_3.working_with_a_string_as_an_object_string_and_stringbuilder;

public class StringAsAnObjectStringAndStringBuilder_7 {

    public static void main(String[] args) {
        String str = "chc aahmbc em rmah";
        System.out.println(str);
        str = removeSpaces(str);
        str = removeNotUnicSymbols(str);
        System.out.println(str);
    }

    private static String removeSpaces(String str) {
        return str.replaceAll(" ", "");
    }

    private static String removeNotUnicSymbols(String str) {
        StringBuilder builder = new StringBuilder(str);

        for (int i = 0; i < builder.length(); i++) {
            while (builder.indexOf(builder.substring(i, i + 1)) != builder.lastIndexOf(builder.substring(i, i + 1))) {
                builder.deleteCharAt(builder.lastIndexOf(builder.substring(i, i + 1)));
            }
        }

        return new String(builder);
    }
}
