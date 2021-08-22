package com.epam.module_4.simplest_classes_and_objects.task_6;

public class Main {

    public static void main(String[] args) {
        Time time = new Time();
        System.out.println(time.getTime());
        time = new Time(100, 1000, 97665);
        System.out.println(time.getTime());
        time = new Time(40, 56, 59);
        System.out.println(time.getTime());
        time = new Time(23,59,59);
        System.out.println(time.getTime());
        time.increaseSeconds(36000);
        System.out.println("increase seconds +36000, result " + time.getTime());
        time.decreaseSeconds(3671);
        System.out.println("decrease seconds -3671, result " + time.getTime());
    }
}
