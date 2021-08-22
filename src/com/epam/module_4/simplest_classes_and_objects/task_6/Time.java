/**
 * Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
 * изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
 * недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на
 * заданное количество часов, минут и секунд.
 */

package com.epam.module_4.simplest_classes_and_objects.task_6;

public class Time {

    private int hours;
    private int minutes;
    private int seconds;

    public Time() {
    }

    public Time(int hours, int minutes, int seconds) {
        this();

        if (hours >= 0 && hours <= 23) {
            this.hours = hours;
        } else {
            System.out.println("<Impossible hours. Created by default>");
        }

        if (minutes >= 0 && minutes <= 59) {
            this.minutes = minutes;
        } else {
            System.out.println("<Impossible minutes. Created by default>");
        }

        if (seconds >= 0 && seconds <= 59) {
            this.seconds = seconds;
        } else {
            System.out.println("<Impossible seconds. Created by default>");
        }
    }

    public String getTime() {
        return hours + ":" + minutes + ":" + seconds;
    }

    public void decreaseHours(int decreasing) {
        hours = (24 - ((decreasing - hours) % 24)) % 24;
    }

    public void decreaseMinutes(int decreasing) {
        int coef = decreasing % 60 > minutes ? 1 : 0;
        decreaseHours(decreasing / 60 + coef);
        minutes = (60 - Math.abs(decreasing - minutes) % 60) % 60;
    }

    public void decreaseSeconds(int decreasing) {
        int coef = decreasing % 60 > seconds ? 1 : 0;
        decreaseMinutes(decreasing / 60 + coef);
        seconds = (60 - (decreasing % 60 - seconds)) % 60;
    }

    public void increaseHours(int increasing) {
        hours = (hours + increasing) % 24;
    }

    public void increaseMinutes(int increasing) {
        increaseHours((minutes + increasing) / 60);
        minutes = (minutes + increasing) % 60;
    }

    public void increaseSeconds(int increasing) {
        increaseMinutes((seconds + increasing) / 60);
        seconds = (seconds + increasing) % 60;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (hours >= 0 && hours <= 23) {
            this.hours = hours;
        } else {
            this.hours = 0;
        }
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        if (minutes >= 0 && minutes <= 59) {
            this.minutes = minutes;
        } else {
            this.minutes = 0;
        }
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        if (seconds >= 0 && seconds <= 59) {
            this.seconds = seconds;
        } else {
            this.seconds = 0;
        }
    }

    public String toString() {
        return hours + ":" + minutes + ":" + seconds;
    }
}
