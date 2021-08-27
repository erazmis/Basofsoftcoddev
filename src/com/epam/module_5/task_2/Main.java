/**
 * Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из
 * нескольких товаров.
 */

package com.epam.module_5.task_2;

public class Main {

    public static void main(String[] args) {
        System.out.println("Products:");
        //+ Arrays.toString(Payment.Products.values()));
        Payment.Products[] products = Payment.Products.values();
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i] + " (cost " + products[i].getCost() + ")");
        }
        System.out.println("Cost of apple (3), pizza (35) and cheese (12): " +
                Payment.totalCost("apple", "cheese", " PiZ-za "));
    }
}
