/**
 * Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
 * метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и
 * методами. Задать критерии выбора данных и вывести эти данные на консоль.
 *
 * Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
 * Найти и вывести:
 * a) список книг заданного автора;
 * b) список книг, выпущенных заданным издательством;
 * c) список книг, выпущенных после заданного года.
 */

package com.epam.module_4.simplest_classes_and_objects.task_9;

public class AboutBooks {

    Book[] books;

    public AboutBooks(Book[] books) {
        this.books = books;
    }

    public void printBooksByAuthor(String author) {
        for (Book book : books) {
            if (book.getAuthors().matches("(.*)" + author + "(.*)")) {
                System.out.println(book.getTitle());
            }
        }
    }

    public void printBooksByPublishingHouse(String publishingHouse) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getPublishingHouse().equalsIgnoreCase(publishingHouse)) {
                System.out.println(books[i].getTitle());
            }
        }
    }

    public void printBooksAfterYear(int year) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getYearOfPublishing() > year) {
                System.out.println(books[i].getTitle());
            }
        }
    }
}
