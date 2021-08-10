/**
 * Из заданной строки получить новую, повторив каждый символ дважды.
 */

package com.epam.module_3.working_with_a_string_as_an_object_string_and_stringbuilder;

public class StringAsAnObjectStringAndStringBuilder_6 {

    public static void main(String[] args) {
        String str = "Я по два раза не повторяю";
        System.out.println(str);
        str = doubleSymbols(str);
        System.out.println(str);
    }

    private static String doubleSymbols(String str) {
        StringBuilder builder = new StringBuilder(str);

        for (int i = 0; i < builder.length(); i += 2) {
            builder.insert(i, builder.charAt(i));
        }

        return new String(builder);
    }
}
