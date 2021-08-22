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

public class Main {

    public static void main(String[] args) {

        Airline a1 = new Airline("Toronto", "B2 1100", "Airbus ", "12:55", "monday", "tUESdaY", "FRIDAy");
        Airline a2 = new Airline("London", "S7 454", "Boeing", "12:20", "friday");
        Airline a3 = new Airline("Moscow", "B2 473", "Cargo airplane", "23:40", "Sunday", "friDAY");
        Airline a4 = new Airline("Berlin", "TK 7728", "Embraer E195-E2", "06:15", "wednesday");
        Airline a5 = new Airline("London", "TK 1979", "Boeing 777-300ER", "09:20", "thursday", "saturday");
        Airline[] airlines = new Airline[] {a1, a2, a3, a4, a5};


        AboutAirlines info = new AboutAirlines(airlines);

        System.out.println("Flights to London:\n" + info.flightsByDestination("London"));
        System.out.println();
        System.out.println("Flights on Friday:\n" + info.flightsByDayOfWeek("friday"));
        System.out.println();
        System.out.println("Flights on Friday after 12:30:\n" + info.flightsByDayOfWeekAndTime("friday", "12:30"));
    }
}
