// Вычислить сумму квадратов первых ста чисел
package com.epam.module_1.cycles;

public class Cycles_3 {

    public static void main(String[] args) {
        int sumOfSqrs = 0;

        for (int i = 1; i < 101; i++) {
            sumOfSqrs += i * i;
        }

        System.out.print("Сумма квадратов первых 100 чисел равна " + sumOfSqrs);
    }
}
