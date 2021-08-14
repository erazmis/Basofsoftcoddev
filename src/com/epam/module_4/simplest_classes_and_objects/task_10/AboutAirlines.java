/**
 * Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
 * и метод  toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
 * методами. Задать критерии выбора данных и вывести эти данные на консоль.
 *
 * Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
 * Найти и вывести:
 * a) список рейсов для заданного пункта назначения;
 * b) список рейсов для заданного дня недели;
 * c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */

package com.epam.module_4.simplest_classes_and_objects.task_10;

public class AboutAirlines {

    Airline[] airlines;

    public AboutAirlines(Airline[] airlines) {
        this.airlines = airlines;
    }

    public String flightsByDestination(String destination) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < airlines.length; i++) {
            if (airlines[i].getDestination().equalsIgnoreCase(destination)) {
                answer.append(airlines[i].toString() + "\n");
            }
        }

        if (answer.toString().isEmpty()) {
            return "No flights";
        } else {
            return answer.toString();
        }
    }

    public String flightsByDayOfWeek(String day) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < airlines.length; i++) {
            if (airlines[i].getDaysOfWeek().matches("(.*)" + day + "(.*)")) {
                answer.append(airlines[i].toString() + "\n");
            }
        }

        if (answer.toString().isEmpty()) {
            return "No flights";
        } else {
            return answer.toString();
        }
    }

    public String flightsByDayOfWeekAndTime(String day, String time) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < airlines.length; i++) {
            if (airlines[i].getDaysOfWeek().matches("(.*)" + day + "(.*)")) {
                int substringEnd = 1;
                while (airlines[i].getDepartureTime().substring(0, substringEnd).equals(time.substring(0, substringEnd))) {
                    substringEnd++;
                }
                if (airlines[i].getDepartureTime().charAt(substringEnd - 1) > time.charAt(substringEnd - 1)) {
                    answer.append(airlines[i].toString() + "\n");
                }
            }
        }

        if (answer.toString().isEmpty()) {
            return "No flights";
        } else {
            return answer.toString();
        }
    }
}
