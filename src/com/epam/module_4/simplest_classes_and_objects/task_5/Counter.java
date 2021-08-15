/**
 * Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
 * на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
 * произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод,
 * позволяющий получить его текущее состояние. Написать код, демонстрирующий все возможности класса.
 */

package com.epam.module_4.simplest_classes_and_objects.task_5;

public class Counter {

    private int count;
    private int[] range;

    public Counter() {
        count = 0;
        range = new int[]{0, 10};
    }

    public Counter(int count, int min, int max) {
        this();

        if (min <= max) {
            range = new int[]{min, max};
        } else {
            System.out.println("<The range (" + min + ", " + max + ") is impossible. It is created by default>");
        }

        if (count < range[1] || count > range[0]) {
            System.out.println("<The count is out of range " + getRange() + ". The Counter is created by default>");
            setRange();
        } else {
            this.count = count;
        }
    }

    public void increaseCount() {
        if (count < range[1]) {
            count++;
        }
    }

    public void decreaseCount() {
        if (count > range[0]) {
            count--;
        }
    }

    public String getCounter() {
        return "count " + count + " in range " + getRange();
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getRange() {
        return "(" + range[0] + ", " + range[1] + ")";
    }

    public void setRange() {
        range = new int[]{0, 10};
    }

    public void setRange(int min, int max) {
        if (count >= min && count <= max) {
            range = new int[]{min, max};
        }
    }

    public void setRangeMin(int min) {
        if (count >= min) {
            range[0] = min;
        } else {
            System.out.println("<The count is out of range (" + min + ",  " + range[1] + "). Nothing is changed>");
        }
    }

    public void setRangeMax(int max) {
        if (count <= max) {
            range[1] = max;
        } else {
            System.out.println("<The count is out of range (" + range[0] + ",  " + max + "). Nothing is changed>");
        }
    }
}
