/**
 * Строка X состоит из нескольких предложений, каждое из которых кончается точкой,
 * восклицательным или вопросительным знаком.
 * Определить количество предложений в строке X.
 */

package com.epam.module_3.working_with_a_string_as_an_object_string_and_stringbuilder;

public class StringAsAnObjectStringAndStringBuilder_10 {

    public static void main(String[] args) {
        String str = "Да пребудет с тобой Сила! " +
                "В чем сила, брат? Покажи мне деньги! " +
                "Кто возьмет билетов пачку, тот получит водокачку! " +
                "Утром деньги — вечером стулья. А можно наоборот? Можно, но деньги вперед! " +
                "Ну, граждане алкоголики, хулиганы, тунеядцы, кто хочет сегодня поработать?";
        System.out.println(str);
        int numberOfSentences = calculateSentences(str);
        System.out.println("Number of sentences: " + numberOfSentences);
    }

    private static int calculateSentences(String str) {
        int numberOfSentences = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '.' || str.charAt(i) == '!' || str.charAt(i) == '?') {
                numberOfSentences++;
            }
        }

        return numberOfSentences;
    }
}
