/**
 * На плоскости заданы своими координатами n точек. Написать метод(методы),
 * определяющие, между какими из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.
 */

package com.epam.module_2.subroutines;

import java.util.Arrays;
import java.util.Random;

public class Subroutines_4 {

    private static final int SIZE = 10;

    public static void main(String[] args) {
        int[][] points = new int[SIZE][2];
        createArrayOfPoints(points);

        printPoints(points);

        maxDistance(points);
    }

    private static void createArrayOfPoints(int[][] points) {
        Random rand = new Random();

        for (int i = 0; i < points.length; i++) {
            points[i][0] = rand.nextInt(101);
            points[i][1] = rand.nextInt(101);
        }
    }

    private static void printPoints(int[][] points) {
        System.out.print("Points [x, y]:");
        for (int i = 0; i < points.length; i++) {
            System.out.printf("  " + Arrays.toString(points[i]));
        }

        System.out.println();
    }

    private static void maxDistance(int[][] coords) {
        double maxDist = 0;
        int[] point1 = new int[2];
        int[] point2 = new int[2];
        for (int i = 0; i < coords.length; i++) {
            for (int j = 0; j < coords.length; j++) {
                if (maxDist < distance(coords[i], coords[j])) {
                    maxDist = distance(coords[i], coords[j]);
                    point1 = coords[i];
                    point2 = coords[j];
                }
            }
        }

        System.out.printf("\nPoints: %s, %s. Distance between them: %s", Arrays.toString(point1), Arrays.toString(point2), maxDist);
    }

    private static double distance(int[] firstPoint, int[] secondPoint) {
        return Math.sqrt(Math.pow(Math.abs(firstPoint[0] - secondPoint[0]), 2) + Math.pow(Math.abs(firstPoint[1] - secondPoint[1]), 2));
    }
}
