/**
 * Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать,
 * вывести на консоль содержимое, дополнить, удалить
 */

package com.epam.module_5.task_1;

public class File {

    protected String name;
    protected Directory way;
    final Directory DEFAULTWAY = new Directory("/home/erazmis/documents/");

    public File() {
        name = "New file";
        way = DEFAULTWAY;
    }

    public File(String name) {
        this.name = name;
        way = DEFAULTWAY;
    }

    public File(String name, Directory way) {
        this.name = name;
        this.way = way;
    }

    public void rename(String name) {
        String[] newName = this.name.split("\\.");
        newName[0] = name;
        setName(String.join(".", newName));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Directory getWay() {
        return way;
    }

    public void setWay(Directory way) {
        this.way = way;
    }
}
