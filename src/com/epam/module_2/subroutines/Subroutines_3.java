/**
 * Вычислить  площадь  правильного  шестиугольника  со  стороной  а,
 * используя  метод  вычисления  площади треугольника.
 */

package com.epam.module_2.subroutines;

import java.util.Random;

public class Subroutines_3 {

    public static void main(String[] args) {
        int side = new Random().nextInt(101);

        System.out.printf("The area of the hexagon with side %d is %.4f\n", side, triangleArea(side) * 6);
    }

    public static double triangleArea(int side) {
        return Math.sqrt(3) / 4 * side * side;
    }
}
