/**
 * Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать,
 * вывести на консоль содержимое, дополнить, удалить
 */

package com.epam.module_5.task_1;

class TextFile extends File {

    private String content;

    public TextFile(String name) {
        this.name = name + ".txt";
    }

    public TextFile(String name, String content) {
        super(name + ".txt");
        this.content = content;
    }

    public void delete() {
        name = null;
        way = null;
        content = null;
    }

    public void deleteContent() {
        content = null;
    }

    public void addContent(String content) {
        this.content += content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
