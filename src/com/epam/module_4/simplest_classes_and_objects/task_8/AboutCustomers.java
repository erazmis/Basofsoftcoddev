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

    Customer[] customers;
    String[] listOfCustomers;

    public AboutCustomers(Customer[] customers) {
        this.customers = customers;
        listOfCustomers = new String[customers.length];
        for (int i = 0; i < listOfCustomers.length; i++) {
            listOfCustomers[i] = customers[i].getLastName() + " " + customers[i].getFirstName() + " " + customers[i].getPatronymic();
        }
    }

    public void printCustomersInAlphabetOrder() {
        Arrays.sort(listOfCustomers);
        System.out.println("Customers:");
        for (int i = 0; i < listOfCustomers.length; i++) {
            System.out.println(i + ". " + listOfCustomers[i]);
        }
    }

    public void printCardNumbersInTheInterval(int begin, int end) {
        System.out.println("Customers with card number from " + begin + " to " + end + ":");
        for (int i = 0; i < customers.length; i++) {
            if (customers[i].getCardNumber() >= begin && customers[i].getCardNumber() <= end) {
                System.out.println(customers[i].getLastName() + " " + customers[i].getFirstName() + " " + customers[i].getPatronymic());
            }
        }
    }
}
