/**
 * Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
 */

package com.epam.module_3.working_with_a_string_as_an_array_of_characters;

public class StringAsAnArrayOfCharacters_1 {

    public static void main(String[] args) {
        String[] array = {"snakeCase", "javaTutor", "winnieThePooh", "FFF"};
        printStringArray(array);
        convertToSnakeCase(array);
        printStringArray(array);
    }

    private static void convertToSnakeCase(String[] array) {
        insertUnderscore(array);
        convertToLowerCase(array);
    }

    private static void insertUnderscore(String[] array) {
        for (int i = 0; i < array.length; i++) {
            char[] ch = array[i].toCharArray();
            char[] result = new char[ch.length + calculateCapitals(ch)];

            int count = 0;

            result[0] = ch[0];
            for (int j = 1; j < ch.length; j++) {
                if (Character.isUpperCase(ch[j])) {
                    result[j + count] = '_';
                    count++;
                }

                result[j + count] = ch[j];
            }

            array[i] = new String(result);
        }
    }

    private static int calculateCapitals(char[] charArray) {
        int count = 0;

        for (int i = 1; i < charArray.length; i++) {
            if (charArray[i] >= 'A' && charArray[i] <= 'Z') {
                count++;
            }
        }

        return count;
    }

    private static void convertToLowerCase(String[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i].toLowerCase();
        }
    }

    private static void printStringArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }

        System.out.println();
    }
}
