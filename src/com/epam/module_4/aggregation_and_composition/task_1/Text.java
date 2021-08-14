/**
 * Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
 * консоль текст, заголовок текста.
 */

package com.epam.module_4.aggregation_and_composition.task_1;

public class Text {

    private String text;

    public Text(Sentence ... sentences) {
        StringBuilder line = new StringBuilder(sentences[0].toString());

        for (int i = 0; i < sentences.length; i++) {
            line.append(" " + sentences[i].toString());
        }

        text = line.append(". ").toString().stripTrailing();
    }

    public void addTitle(String title) {
        text = title + "\n" + text;
    }

    public void addText(String text) {
        this.text = " " + text;
    }

    public void addText(Text text) {
        this.text = " " + text.toString();
    }

    public void printText() {
        System.out.println(text);
    }

    @Override
    public String toString() {
        return text;
    }
}
