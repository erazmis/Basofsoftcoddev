/**
 * Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
 * из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
 * номеров групп студентов, имеющих оценки, равные только 9 или 10.
 */

package com.epam.module_4.simplest_classes_and_objects.task_3;

import java.util.Random;

public class Main {

    private static final int SIZE = 10;

    public static void main(String[] args) {
        Student[] students = new Student[SIZE];

        students[0] = new Student("McGonagall", "M", 1, createPerformance());
        students[1] = new Student("Lupin", "R", 1, createPerformance());
        students[2] = new Student("Black", "S", 2, createPerformance());
        students[3] = new Student("Riddle", "TM", 3, createPerformance());
        students[4] = new Student("Potter", "HJ", 2, createPerformance());
        students[5] = new Student("Severus", "S", 1, createPerformance());
        students[6] = new Student("Weasley", "RB", 2, createPerformance());
        students[7] = new Student("Dumbledore", "APWB", 1, createPerformance());
        students[8] = new Student("Longbottom", "N", 2, createPerformance());
        students[9] = new Student("Malfoy", "D", 3, createPerformance());

        printStudents(students);

        System.out.println("High performing students:\n" + Students.highPerfomingStudents(students));
    }

    private static int[] createPerformance() {
        Random rand = new Random();
        int[] performance = new int[5];
        for (int i = 0; i < performance.length; i++) {
            performance[i] = rand.nextInt(3) + 8;
        }
        return performance;
    }

    private static void printStudents(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }
}
