/**
 * Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих
 * переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
 * наибольшее значение из этих двух переменных.
 */

package com.epam.module_4.simplest_classes_and_objects.task_1;

public class Test1 {

    private int first;
    private int second;

    public Test1() {
    }

    public Test1(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public int sum() {
        return first + second;
    }

    public int max() {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
}
