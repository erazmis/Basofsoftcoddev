/**
 * В строке вставить после каждого символа 'a' символ 'b'.
 */

package com.epam.module_3.working_with_a_string_as_an_object_string_and_stringbuilder;

public class StringAsAnObjectStringAndStringBuilder_2 {

    public static void main(String[] args) {
        String str = "amigo, are you ok?";
        System.out.println(str);
        str = str.replaceAll("a", "ab");
        System.out.println(str);
    }
}
