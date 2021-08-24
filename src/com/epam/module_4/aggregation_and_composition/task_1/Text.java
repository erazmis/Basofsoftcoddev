/**
 * Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
 * консоль текст, заголовок текста.
 */

package com.epam.module_4.aggregation_and_composition.task_1;

public class Text {

    private Sentence[] sentences;
    private Sentence title;

    public Text() {
    }

    public Text(Sentence title, Sentence... text) {
        this.sentences = text;
        this.title = title;
    }

    public void addContent(Sentence... sentences) {
        Sentence[] newText = new Sentence[this.sentences.length + sentences.length];
        for (int i = 0; i < this.sentences.length; i++) {
            newText[i] = this.sentences[i];
        }

        for (int i = 0; i < sentences.length; i++) {
            newText[this.sentences.length + i] = sentences[i];
        }

        this.sentences = newText;
    }

    public Sentence[] getSentences() {
        return sentences;
    }

    public String getContentAsString() {
        String[] strs = new String[sentences.length];

        for (int i = 0; i < sentences.length; i++) {
            strs[i] = sentences[i].toString();
        }

        return String.join(". ", strs) + ".";

    }

    public void setSentences(Sentence[] sentences) {
        this.sentences = sentences;
    }

    public Sentence getTitle() {
        return title;
    }

    public void setTitle(Sentence title) {
        this.title = title;
    }

    @Override
    public String toString() {
        String[] strs = new String[sentences.length];

        for (int i = 0; i < sentences.length; i++) {
            strs[i] = sentences[i].toString();
        }

        return title + "\n" +
                String.join(". ", strs) + ".";
    }
}
