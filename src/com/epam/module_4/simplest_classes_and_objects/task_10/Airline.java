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

public class Airline {

    private String destination;
    private int flightNumber;
    private String aircraftType;
    private String departureTime;
    private String daysOfWeek;

    public Airline() {
    }

    public Airline(String destination, int flightNumber, String aircraftType, String departureTime, String daysOfWeek) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.aircraftType = aircraftType;
        this.departureTime = departureTime;
        this.daysOfWeek = daysOfWeek;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getDaysOfWeek() {
        return daysOfWeek;
    }

    public void setDaysOfWeek(String daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
    }

    @Override
    public String toString() {
        return "Destination: " + destination +
                "\nDeparture time: " + daysOfWeek + ", " + departureTime +
                "\nFlight number: " + flightNumber +
                "\nAircraft type: " + aircraftType;
    }
}
