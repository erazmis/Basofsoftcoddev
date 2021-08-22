/**
 * Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
 * и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами
 * и методами. Задать критерии выбора данных и вывести эти данные на консоль.
 * <p>
 * Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
 * Найти и вывести:
 * a) список покупателей в алфавитном порядке;
 * b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
 */

package com.epam.module_4.simplest_classes_and_objects.task_8;

import java.util.Arrays;

public class AboutCustomers {

    private Customer[] customers;

    public AboutCustomers(Customer[] customers) {
        this.customers = customers;
    }

    public String customersInAlphabetOrder() {
        String[] listOfCustomers = new String[customers.length];

        for (int i = 0; i < listOfCustomers.length; i++) {
            listOfCustomers[i] = customers[i].getLastName() + " " + customers[i].getFirstName() + " " + customers[i].getMiddleName();
        }

        Arrays.sort(listOfCustomers);

        StringBuilder sortedCustomers = new StringBuilder();

        for (int i = 0; i < listOfCustomers.length; i++) {
            sortedCustomers.append(listOfCustomers[i] + "\n");
        }

        return sortedCustomers.toString();
    }

    public String cardNumbersInTheInterval(int begin, int end) {
        StringBuilder selectedCustomers = new StringBuilder();

        for (int i = 0; i < customers.length; i++) {
            if (customers[i].getCardNumber() >= begin && customers[i].getCardNumber() <= end) {
                selectedCustomers.append(customers[i].getLastName() + " " + customers[i].getFirstName() + " " + customers[i].getMiddleName() + "\n");
            }
        }

        return selectedCustomers.toString();
    }
}
