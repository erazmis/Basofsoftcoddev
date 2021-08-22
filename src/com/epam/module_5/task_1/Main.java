/**
 * Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать,
 * вывести на консоль содержимое, дополнить, удалить
 */

package com.epam.module_5.task_1;

public class Main {

    public static void main(String[] args) {
        TextFile notes = new TextFile("notes");
        System.out.println("File name: " + notes.getName());
        System.out.println("Directory: " + notes.getWay());
        notes.rename("notes 23.08");
        System.out.println("New name: " + notes.getName());
        notes.setContent("shopping list:");
        notes.addContent("\napple");
        notes.addContent("\ngrapes\npizza");
        System.out.println("Content:\n" + "\"".repeat(20) + "\n" + notes.getContent() + "\n" + "\"".repeat(20));
        notes.deleteContent();
        System.out.println("Content after it was deleted:\n" + notes.getContent());
        notes.delete();
        System.out.println("File name after deleting the file: " + notes.getName() +
                "\nFile directory after deleting: " + notes.getWay());
    }
}
