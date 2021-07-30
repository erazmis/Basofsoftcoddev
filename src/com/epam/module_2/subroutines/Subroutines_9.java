/**
 * Даны числа X, Y, Z, Т — длины сторон четырёхугольника. Написать метод(методы) вычисления его площади,
 * если угол между сторонами длиной X и Y — прямой.
 */

package com.epam.module_2.subroutines;

import java.util.Random;

class Subroutines_9 {

    public static void main(String[] args) {
        Random rand = new Random();
        int x = rand.nextInt(51);
        int y = rand.nextInt(51);
        int z = rand.nextInt(51);
        int t = rand.nextInt(51);

        System.out.printf("The area of a quadrilateral with sides %d, %d, %d, and %d, " +
                "and a right angle between sides %d and %d is %.4f", x, y, z, t, x, y, areaOfQuadrilat(x, y, z, t));
    }

    private static double areaOfQuadrilat(int x, int y, int sideA, int sideB) {
        double triAngleRightArea = (double) (x * y) / 2;
        double sideC = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

        double semiPerim = (sideA + sideB + sideC) / 2;
        double triangArea = Math.sqrt(semiPerim * (semiPerim - sideA) * (semiPerim - sideB) * (semiPerim - sideC));
        return triAngleRightArea + triangArea;
    }
}
