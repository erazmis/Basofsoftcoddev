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
        hours = 0;
        minutes = 0;
        seconds = 0;
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
        String hours = toString(this.hours);
        String minutes = toString(this.minutes);
        String seconds = toString(this.seconds);

        return hours + ":" + minutes + ":" + seconds;
    }

    public int increaseHours(int increasing) {
        if (hours + increasing > 23) {
            hours = hours + increasing - 24;
        } else {
            hours += increasing;
        }

        return hours;
    }

    public int increaseMinutes(int increasing) {
        if (minutes + increasing > 59) {
            increaseHours((minutes + increasing) / 60);
            minutes = (minutes + increasing) % 60;
        } else {
            minutes += increasing;
        }

        return minutes;
    }

    public int increaseSeconds(int increasing) {
        if (seconds + increasing > 59) {
            increaseMinutes((seconds + increasing) / 60);
            seconds = (seconds + increasing) % 60;
        } else {
            seconds += increasing;
        }

        return seconds;
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

    public String toString(int digits) {
        if (digits < 10) {
            return "0" + digits;
        } else {
            return "" + digits;
        }
    }
}
