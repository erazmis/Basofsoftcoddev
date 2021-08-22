package com.epam.module_4.simplest_classes_and_objects.task_3;

public class Students {

    public static String highPerfomingStudents(Student[] students) {
        StringBuilder listOfStudents = new StringBuilder();

        for (int i = 0; i < students.length; i++) {
            boolean isHighPerfomance = true;

            for (int j = 0; j < students[i].getAcademicPerformance().length; j++) {
                isHighPerfomance = (isHighPerfomance && (students[i].getAcademicPerformance()[j] > 8));
            }
            if (isHighPerfomance) {
                listOfStudents.append(students[i].getSurname() + ", group " + students[i].getGroupNumber() + "\n");
            }
        }

        return listOfStudents.toString();
    }
}
