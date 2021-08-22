/**
 * Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. Добавьте
 * конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра
 * класса.
 */

package com.epam.module_4.simplest_classes_and_objects.task_2;

public class Test2 {

    private String name;
    private String surname;

    public Test2(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Test2() {
        this.name = "John";
        this.surname = "Doe";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
