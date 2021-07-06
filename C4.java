package com.company;

import java.math.BigInteger;

public class C4 {

    public static void main(String[] args) {
        BigInteger product = BigInteger.valueOf(1);
        BigInteger sqrI;

        for (int i = 1; i < 201; i++) {
            sqrI = BigInteger.valueOf(i * i);
            product = product.multiply(sqrI);
        }

        System.out.print("Произведение квадратов первых 200 чисел равно " + product);
    }
}
