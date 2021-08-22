/**
 * Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
 * на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
 * произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод,
 * позволяющий получить его текущее состояние. Написать код, демонстрирующий все возможности класса.
 */

package com.epam.module_4.simplest_classes_and_objects.task_5;

public class Counter {

    private int count;
    private int max;

    public Counter() {
        max = 10;
    }

    public Counter(int count, int max) {
        if (max < 1) {
            this.max = 10;
        } else {
            this.max = max;
        }

        if (count >= 0 && count <= max) {
            this.count = count;
        }
    }

    public void increaseCount() {
        if (count < max) {
            count++;
        } else {
            count = 0;
        }
    }

    public void decreaseCount() {
        if (count > 0) {
            count--;
        } else {
            count = max;
        }
    }

    public String getCounter() {
        return "count " + count + " in range from 0 to " + max;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getMax() {
        return max;
    }

    public String getRange() {
        return "(0, " + max + ")";
    }

    public void setRange(int max) {
        if (count <= max) {
            this.max = max;
        }
    }
}
