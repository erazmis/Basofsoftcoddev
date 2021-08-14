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

        System.out.println("counter1 will be created by default. To create counter 2 you need to enter count, minimum and maximum range value." +
                "\nIf you count is out of range, counter2 will be created by default: count = 0, min value = 0, max value = 10." +
                "\nYou will also see a message about this error." +
                "\nEnter count for counter2:");
        int count2 = scan.nextInt();

        System.out.println("Enter minimum range value:");
        int min2 = scan.nextInt();

        System.out.println("Enter maximum range value:");
        int max2 = scan.nextInt();

        Counter counter1 = new Counter();
        Counter counter2 = new Counter(count2, min2, max2);

        System.out.println("After creation default counter (counter1) has count " + counter1.getCount() + " and range " + counter1.getRange() +
                ".\nCounter with user's input (counter2) has count " + counter2.getCount() + " and range " + counter2.getRange());

        counter1.decreaseCount();
        int count2BeforeIncreasing = counter2.getCount();
        counter2.increaseCount();
        System.out.println("Methods increaseCount() and decreaseCount() work only if the result won't be out of range." +
                "\nDecreased count in counter1: from 0 to " + counter1.getCount() +
                "\nIncreased count in counter2: from " + count2BeforeIncreasing + " to " + counter2.getCount() +
                "\nYou can also change min or max range value or both of them. If after changes count is out of range, the range won't be changed." +
                "\nLet's change minimun value in counter1. Enter new minimum range value:");

        int newMinValue1 = scan.nextInt();
        counter1.setRangeMin(newMinValue1);

        System.out.println("By method getCounter() we can see, what happened with range. The output of the method for counter1 looks like this: " + counter1.getCounter() +
                "\nLet's change min and max range value of counter2. Enter new minimum range value:");
        int newMinValue2 = scan.nextInt();

        System.out.println("Enter new maximum range value:");
        int newMaxValue2 = scan.nextInt();

        counter2.setRange(newMinValue2, newMaxValue2);

        System.out.println("New counter2: " + counter2.getCounter());


    }
}
