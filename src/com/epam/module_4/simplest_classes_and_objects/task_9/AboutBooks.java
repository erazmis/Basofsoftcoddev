/**
 * Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
 * метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и
 * методами. Задать критерии выбора данных и вывести эти данные на консоль.
 * <p>
 * Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
 * Найти и вывести:
 * a) список книг заданного автора;
 * b) список книг, выпущенных заданным издательством;
 * c) список книг, выпущенных после заданного года.
 */

package com.epam.module_4.simplest_classes_and_objects.task_9;

public class AboutBooks {

    private Book[] books;

    public AboutBooks(Book[] books) {
        this.books = books;
    }

    public String booksByAuthor(String author) {
        StringBuilder answer = new StringBuilder();

        for (Book book : books) {
            if (book.getAuthors().matches("(.*)" + author + "(.*)")) {
                answer.append(book.getTitle() + ", ");
            }
        }

        return answer.toString();
    }

    public String booksByPublishingHouse(String publishingHouse) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < books.length; i++) {
            if (books[i].getPublishingHouse().equalsIgnoreCase(publishingHouse)) {
                answer.append(books[i].getTitle() + ", ");
            }
        }

        return answer.toString();
    }

    public String booksAfterYear(int year) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < books.length; i++) {
            if (books[i].getYearOfPublishing() > year) {
                answer.append(books[i].getTitle() + ", ");
            }
        }

        return answer.toString();
    }
}
