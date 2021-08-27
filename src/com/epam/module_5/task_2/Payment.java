/**
 * Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из
 * нескольких товаров.
 */

package com.epam.module_5.task_2;

public class Payment {

    enum Products {

        APPLE(3),
        GRAPES(10),
        SOURCREAM(8),
        PIZZA(35),
        MILK(8),
        CHEESE(12);

        private int cost;

        Products(int cost) {
            this.cost = cost;
        }

        public int getCost() {
            return cost;
        }
    }

    public static int totalCost(String ... food) {
        Products[] products = new Products[food.length];
        for (int i = 0; i < products.length; i++) {
            products[i] = Products.valueOf(food[i].strip().replaceAll("\\W", "").toUpperCase());
        }
        int sum = 0;

        for (int i = 0; i < products.length; i++) {
            sum += products[i].getCost();
        }

        return sum;
    }
}