/**
 * Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
 * Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
 * номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
 * Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
 * назначения должны быть упорядочены по времени отправления.
 */
package com.epam.module_4.simplest_classes_and_objects.task_4;

public class Train {

    protected String destination;
    protected int trainNumber;
    protected String departureTime;

    public Train() {
    }

    public Train(String destination, int trainNumber, String departureTime) {
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.departureTime = departureTime;
    }

    public void sortByTrainNumber(Train[] trains) {
        Train buffer;
        for (int i = 1; i < trains.length; i++) {
            if (trains[i - 1].trainNumber > trains[i].trainNumber) {
                buffer = trains[i - 1];
                trains[i - 1] = trains[i];
                trains[i] = buffer;
                if (i > 1) {
                    i -= 2;
                }
            } else if (trains[i - 1].trainNumber == trains[i].trainNumber) {
                int substringEnd = 1;
                while (trains[i - 1].departureTime.substring(0, substringEnd).equals(trains[i].departureTime.substring(0, substringEnd))) {
                    substringEnd++;
                }
                if (trains[i - 1].departureTime.charAt(substringEnd - 1) > trains[i].departureTime.charAt(substringEnd - 1)) {
                    buffer = trains[i - 1];
                    trains[i - 1] = trains[i];
                    trains[i] = buffer;
                }
            }
        }
    }

    public String info() {
        return "Train number: " + trainNumber +
                "\nDestination: " + destination +
                "\nDeparture time: " + departureTime;
    }

    public void sortByDestination(Train[] trains) {
        Train buffer;

        for (int i = 1; i < trains.length; i++) {
            if (trains[i].destination.equalsIgnoreCase(trains[i - 1].destination)) {
                int index = 0;
                while (trains[i].departureTime.charAt(index) == trains[i - 1].departureTime.charAt(index)) {
                    index++;
                }
                if (trains[i].departureTime.charAt(index) < trains[i - 1].departureTime.charAt(index)) {
                    buffer = trains[i];
                    trains[i] = trains[i - 1];
                    trains[i - 1] = buffer;
                }
            } else {
                int index = 0;
                while (trains[i].destination.charAt(index) == trains[i - 1].destination.charAt(index)) {
                    index++;
                }
                if (trains[i].destination.charAt(index) < trains[i - 1].destination.charAt(index)) {
                    buffer = trains[i];
                    trains[i] = trains[i - 1];
                    trains[i - 1] = buffer;

                    if (i > 1) {
                        i -= 2;
                    }
                }
            }
        }
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String toString(Train[] trains) {
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < trains.length; i++) {
            str.append(trains[i].info() + "\n\n");
        }

        return str.toString();
    }
}
