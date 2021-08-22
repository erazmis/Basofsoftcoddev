/**
 * Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
 * из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
 * номеров групп студентов, имеющих оценки, равные только 9 или 10.
 */

package com.epam.module_4.simplest_classes_and_objects.task_3;

import java.util.Arrays;

public class Student {

    private String surname;
    private String initials;
    private int groupNumber;
    private int[] academicPerformance;

    public Student() {
    }

    public Student(String surname, String initials, int groupNumber, int[] academicPerformance) {
        this.surname = surname;
        this.initials = initials;
        this.groupNumber = groupNumber;
        this.academicPerformance = academicPerformance;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public int[] getAcademicPerformance() {
        return academicPerformance;
    }

    public void setAcademicPerformance(int[] academicPerformance) {
        this.academicPerformance = academicPerformance;
    }

    @Override
    public String toString() {
        return surname + ", " + initials + ", group " + groupNumber +
                ", academic performance: " + Arrays.toString(academicPerformance);
    }
}
