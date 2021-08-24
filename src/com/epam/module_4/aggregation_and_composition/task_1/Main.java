/**
 * Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
 * консоль текст, заголовок текста.
 */

package com.epam.module_4.aggregation_and_composition.task_1;

public class Main {

    public static void main(String[] args) {
        String title = "SOLID";

        Sentence titleSentence = new Sentence(new Word(title));

        String[] theory = "In software engineering, SOLID is a mnemonic acronym for five design principles intended to make software designs more understandable, flexible, and maintainable".split(" ");

        Word[] words = new Word[theory.length];
        int index = 0;

        for (String str : theory) {
            words[index] = new Word(str);
            index++;
        }

        Sentence sentence1 = new Sentence(words);
        Text text = new Text(titleSentence, sentence1);

        System.out.println("Title:\n" + text.getTitle());
        System.out.println("Text:\n" + text.getContentAsString());

        String[] moreTheory = "The principles are a subset of many principles promoted by American software engineer and instructor Robert C Martin, first introduced in his 2000 paper Design Principles and Design Patterns".split(" ");
        Word[] moreWords = new Word[moreTheory.length];
        index = 0;

        for (String str : moreTheory) {
            moreWords[index] = new Word(str);
            index++;
        }

        Sentence sentence2 = new Sentence(moreWords);

        text.addContent(sentence2);

        System.out.println("Text with title and added content:\n" + text);
    }
}
