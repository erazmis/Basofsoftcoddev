/**
 * Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать,
 * вывести на консоль содержимое, дополнить, удалить
 */

package com.epam.module_5.task_1;

public class Directory {

    private String way;

    public Directory() {
    }

    public Directory(String way) {
        this.way = way;
    }

    public String getWay() {
        return way;
    }

    public void changeWay(String way) {
        this.way = way;
    }

    @Override
    public String toString() {
        return way;
    }
}
