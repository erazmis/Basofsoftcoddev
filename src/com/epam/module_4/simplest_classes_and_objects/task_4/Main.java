/**
 * Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
 * Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
 * номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
 * Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
 * назначения должны быть упорядочены по времени отправления.
 */

package com.epam.module_4.simplest_classes_and_objects.task_4;

public class Main {

    private static final int SIZE = 5;

    public static void main(String[] args) {
        Train train = new Train();

        Train[] trains = new Train[SIZE];

        trains[0] = new Train("Grodno", 123, "12:56");
        trains[1] = new Train("Vitebsk", 432, "22:32");
        trains[2] = new Train("Vitebsk", 639, "09:29");
        trains[3] = new Train("Brest", 76, "11:50");
        trains[4] = new Train("Polotsk", 66, "15:48");

        train.sortByTrainNumber(trains);

        System.out.println("Trains, sorted by number:\n" + train.toString(trains));

        train.sortByDestination(trains);

        System.out.println("Trains, sorted by destination:\n" + train.toString(trains));
    }
}
