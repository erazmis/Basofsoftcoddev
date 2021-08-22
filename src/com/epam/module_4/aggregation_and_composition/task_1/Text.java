/**
 * Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
 * консоль текст, заголовок текста.
 */

package com.epam.module_4.aggregation_and_composition.task_1;

public class Text {

    private Sentence[] content;
    private Word title;

    public Text() {
    }

    public Text(Word title, Sentence ... text) {
        this.content = text;
        this.title = title;
    }

    public Text(String title, String str) {
        this.title = new Word(title);

        String[] splitByDot = str.split("\\.");
        content = new Sentence[splitByDot.length];

        for (int i = 0; i < content.length; i++) {
            String[] splitBySpace = splitByDot[i].stripLeading().split(" ");
            Word[] words = new Word[splitBySpace.length];

            for (int j = 0; j < words.length; j++) {
                words[j] = new Word(splitBySpace[j]);
            }
            content[i] = new Sentence(words);
        }
    }

    public Text(String content) {
        String[] splitByDot = content.split("\\.");
        Sentence[] sentences = new Sentence[splitByDot.length];

        for (int i = 0; i < sentences.length; i++) {
            String[] splitBySpace = splitByDot[i].stripLeading().split(" ");
            Word[] words = new Word[splitBySpace.length];

            for (int j = 0; j < words.length; j++) {
                words[j] = new Word(splitBySpace[j]);
            }
            sentences[i] = new Sentence(words);
        }

        this.content = sentences;
    }

    public void addContent(String str) {
        String[] strings = str.split("\\.");
        Sentence[] adding = new Sentence[strings.length];

        for (int i = 0; i < adding.length; i++) {
            adding[i] = new Sentence(strings[i]);
        }

        Sentence[] newText = new Sentence[content.length + adding.length];
        for (int i = 0; i < content.length; i++) {
            newText[i] = content[i];
        }

        for (int i = 0; i < adding.length; i++) {
            newText[content.length + i] = adding[i];
        }

        content = newText;
    }

    public void addContent(Sentence ... sentences) {
        Sentence[] newText = new Sentence[content.length + sentences.length];
        for (int i = 0; i < content.length; i++) {
            newText[i] = content[i];
        }

        for (int i = 0; i < sentences.length; i++) {
            newText[content.length + i] = sentences[i];
        }

        content = newText;
    }

    public Sentence[] getContent() {
        return content;
    }

    public String getContentAsString() {
        String[] strs = new String[content.length];

        for (int i = 0; i < content.length; i++) {
            strs[i] = content[i].toString();
        }

        return String.join(" ", strs);

    }

    public void setContent(Sentence[] content) {
        this.content = content;
    }

    public Word getTitle() {
        return title;
    }

    public void setTitle(Word title) {
        this.title = title;
    }

    @Override
    public String toString() {
        String[] strs = new String[content.length];

        for (int i = 0; i < content.length; i++) {
            strs[i] = content[i].toString();
        }

        return title + "\n" +
                String.join(" ", strs);
    }
}
