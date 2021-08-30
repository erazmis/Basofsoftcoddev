/**
 * Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из
 * нескольких товаров.
 */

package com.epam.module_5.task_2;

import java.util.ArrayList;

public class Payment {

    public static int totalCost(ArrayList<String> food) {
        int sum = 0;

        for (String product : food) {
            product = product.replaceAll("\\W", "").toUpperCase();
            sum += Products.valueOf(product).getCost();
        }

        return sum;
    }

    enum Products {

        APPLE(3),
        GRAPES(10),
        SOURCREAM(8),
        PIZZA(35),
        MILK(8),
        CHEESE(12);

        private final int cost;

        Products(int cost) {
            this.cost = cost;
        }

        public int getCost() {
            return cost;
        }

        public static boolean contains(String thing) {
            thing = thing.replaceAll("\\W", "").toUpperCase();

            for (Products item : Products.values()) {
                if (thing.equals(item.toString())) {
                    return true;
                }
            }

            return false;
        }
    }
}