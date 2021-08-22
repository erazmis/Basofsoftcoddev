/**
 * Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
 * консоль текст, заголовок текста.
 */

package com.epam.module_4.aggregation_and_composition.task_1;

public class Main {

    public static void main(String[] args) {
        String example = "In software engineering, SOLID is a mnemonic acronym for five design principles " +
                "intended to make software designs more understandable, flexible, and maintainable. " +
                "The principles are a subset of many principles promoted by American software engineer and instructor " +
                "Robert C. Martin, first introduced in his 2000 paper Design Principles and Design Patterns.";
        String title = "SOLID";

        Text text = new Text(title, example);

        System.out.println("Text with title:\n" + text);

        String content = "The SOLID concepts are the Single-responsibility principle, the Open–closed principle, " +
                "the Liskov substitution principle, The Interface segregation principle, the Dependency inversion principle.";

        System.out.println("Content: " + content);

        text.addContent(content);

        System.out.println("Title: " + text.getTitle());
        System.out.println("Text with added content: " + text.getContentAsString());
    }
}
