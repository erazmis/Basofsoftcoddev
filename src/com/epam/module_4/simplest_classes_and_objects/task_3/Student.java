/**
 * Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
 * из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
 * номеров групп студентов, имеющих оценки, равные только 9 или 10.
 */

package com.epam.module_4.simplest_classes_and_objects.task_3;

public class Student {

    private String surname;
    private String initials;
    private int groupNumber;
    private double[] academicPerformance;

    public Student() {
    }

    public Student(String surname, String initials, int groupNumber, double[] academicPerformance) {
        this.surname = surname;
        this.initials = initials;
        this.groupNumber = groupNumber;
        this.academicPerformance = academicPerformance;
    }

    public String getSurname() {
        return surname;
    }

    public String highPerfomingStudents(Student[] students) {
        StringBuilder listOfStudents = new StringBuilder("High performing students: ");

        boolean isHighPerfomance = true;

        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students[i].academicPerformance.length; j++) {
                isHighPerfomance = isHighPerfomance && (students[i].academicPerformance[j] > 8);
            }
            if (isHighPerfomance) {
                listOfStudents.append(students[i].surname + ", ");
            }
        }

        return listOfStudents.toString();
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

    public double[] getAcademicPerformance() {
        return academicPerformance;
    }

    public void setAcademicPerformance(double[] academicPerformance) {
        this.academicPerformance = academicPerformance;
    }
}
