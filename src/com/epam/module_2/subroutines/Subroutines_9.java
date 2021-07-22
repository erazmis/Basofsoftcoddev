/**
 * Даны числа X, Y, Z, Т — длины сторон четырёхугольника. Написать метод(методы) вычисления его площади, 
 * если угол между сторонами длиной X и Y — прямой.
 */

package com.epam.module_2.subroutines;

import java.util.Random;
import java.lang.Math;

class Subroutines_9 {

	public static void main(String[] args) {
		Random rand = new Random();
		double x = (double) rand.nextInt(51);
		double y = (double) rand.nextInt(51);
		double z = (double) rand.nextInt(51);
		double t = (double) rand.nextInt(51);

		System.out.printf("The area of a quadrilateral with sides %s, %s, %s, and %s, and a right angle between sides %s and %s is %s", x, y, z, t, x, y, areaOfQuadrilat(x, y, z, t));
	}

	private static double areaOfQuadrilat(double x, double y, double triangA, double triangB) {
		double triAngleRightArea = (x * y) / 2;
		double triangC = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		
		double semiPerim = (triangA + triangB + triangC) / 2;
		double triangArea = Math.sqrt(semiPerim * (semiPerim - triangA) * (semiPerim - triangB) * (semiPerim - triangC));
		return triAngleRightArea + triangArea;
	}
}
