/**
 * Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
 * на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
 * произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод,
 * позволяющий получить его текущее состояние. Написать код, демонстрирующий все возможности класса.
 */

package com.epam.module_4.simplest_classes_and_objects.task_5;

import java.util.Scanner;

public class DemonstrationOfCounter {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("counter1 will be created by default. To create counter 2 you need to enter count and maximum range value." +
                "\nIf your count is out of range, counter2 will be created by default: count = 0, max value = 10." +
                "\nEnter count for counter2:");
        int count2 = scan.nextInt();

        System.out.println("Enter maximum range value:");
        int max2 = scan.nextInt();

        Counter counter1 = new Counter();
        Counter counter2 = new Counter(count2, max2);

        System.out.println("After creation default counter (counter1) has count " + counter1.getCount() + " and range " + counter1.getRange() +
                ".\nCounter with user's input (counter2) has count " + counter2.getCount() + " and range " + counter2.getRange());

        counter1.decreaseCount();
        counter2.setCount(counter2.getMax());
        counter2.increaseCount();
        System.out.println("If count is equal to maximum value, after using method increaseCount() count will be equal to 0." +
                "\nIf count is equal to 0, after using method increaseCount() count will be equal to maximum value." +
                "\nCount in counter1 is equal to 0. Decreased count in counter1 is equal to " + counter1.getCount() +
                "\nLet's make count in counter2 equal to maximum range value. Now it is equal to " + counter2.getMax() +
                "\nIncreased count in counter2 is equal to " + counter2.getCount() +
                "\nYou can also change max range value. If after changes count is out of range, the range won't be changed." +
                "\nLet's change maximum value in counter1. Enter new maximum range value:");

        int newMaxValue1 = scan.nextInt();
        counter1.setRange(newMaxValue1);

        System.out.println("By method getCounter() we can see, what happened with range. The output of the method for counter1 looks like this: " + counter1.getCounter());
    }
}
