/**
 * Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из
 * нескольких товаров.
 */

package com.epam.module_5.task_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static final Scanner scan = new Scanner(System.in);
    private static final ArrayList<String> basket = new ArrayList<>();

    public static void main(String[] args) {
        printAllProducts();

        System.out.println("If you prefer entering numbers of products, enter 1" +
                "\nIf you prefer entering their names, enter 2");

        int answer = scan.nextInt();
        scan.reset();

        switch (answer) {
            case 1:
                selectByNumbers();
                break;
            case 2:
                selectByNames();
                break;
            default:
                System.exit(-1);
        }

        System.out.println("Total cost: " + Payment.totalCost(basket));
    }

    private static void selectByNumbers() {
        System.out.printf("To select product enter its number (from 1 to %d)\nTo complete the selection and display total cost enter 0\n",
                Payment.Products.values().length);

        int input;

        do {
            input = scan.nextInt() - 1;
            if (input >= 0 && input < Payment.Products.values().length) {
                basket.add(Payment.Products.values()[input].toString());
            }
        } while (input != -1);

        printSelectedProducts();
    }

    private static void selectByNames() {
        System.out.println("To select product enter its name\nTo complete the selection and display total cost enter 0");

        String input;

        do {
            input = scan.nextLine();

            if (Payment.Products.contains(input)) {
                basket.add(input);
            }
        } while (!input.equals("0"));

        printSelectedProducts();
    }

    private static void printSelectedProducts() {
        System.out.println("Selected products:");

        for (String s : basket) {
            System.out.println(s.replaceAll("\\W", "").toUpperCase());
        }
    }

    private static void printAllProducts() {
        System.out.println("Products:");
        Payment.Products[] products = Payment.Products.values();

        for (Payment.Products product : products) {
            System.out.println(product + " (price: " + product.getCost() + ")");
        }
    }
}
