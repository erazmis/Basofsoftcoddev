/**
 * Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления
 * площади, периметра и точки пересечения медиан.
 * <p>
 * I don't use Math.hypot(), 'cause it's slower, than Math.sqrt(Math.pow(), Math.pow())
 */

package com.epam.module_4.simplest_classes_and_objects.task_7;

public class Triangle {

    private int pointAX;
    private int pointAY;
    private int pointBX;
    private int pointBY;
    private int pointCX;
    private int pointCY;

    private double sideAB;
    private double sideBC;
    private double sideCA;

    public Triangle() {
        pointAX = 0;
        pointAY = 3;
        pointBX = 0;
        pointBY = 0;
        pointCX = 4;
        pointCY = 0;
        calculateSides(pointAX, pointAY, pointBX, pointBY, pointCX, pointCY);
    }

    public Triangle(int pointAX, int pointAY, int pointBX, int pointBY, int pointCX, int pointCY) {
        this();
        calculateSides(pointAX, pointAY, pointBX, pointBY, pointCX, pointCY);
        if ((sideAB + sideBC > sideCA) && (sideAB + sideCA > sideBC) && (sideBC + sideCA > sideAB)) {
            this.pointAX = pointAX;
            this.pointAY = pointAY;
            this.pointBX = pointBX;
            this.pointBY = pointBY;
            this.pointCX = pointCX;
            this.pointCY = pointCY;
        } else {
            System.out.println("<Triangle with this points is impossible. Triangle is created by default>");
            calculateSides(this.pointAX, this.pointAY, this.pointBX, this.pointBY, this.pointCX, this.pointCY);
        }
    }

    public double area() {
        double semiPerimeter = (sideAB + sideBC + sideCA) / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - sideAB) * (semiPerimeter - sideBC) * (semiPerimeter - sideCA));
    }

    public double perimeter() {
        return sideAB + sideBC + sideCA;
    }

    public String medianIntersectionPoint() {
        double middleOfSideBCX = (pointCX + pointBX) - (double) (Math.abs(pointBX - pointCX) / 2);
        double middleOfSideBCY = (pointCY + pointBY) - (double) (Math.abs(pointBY - pointCY) / 2);
        double medianIntersectionPointX = (pointAX + middleOfSideBCX) - Math.abs(pointAX - middleOfSideBCX) / 3;
        double medianIntersectionPointY = (pointAY + middleOfSideBCY) - Math.abs(pointAY - middleOfSideBCY) / 3;
        return "(" + medianIntersectionPointX + ", " + medianIntersectionPointY + ")";
    }

    private void calculateSides(int pointAX, int pointAY, int pointBX, int pointBY, int pointCX, int pointCY) {
        sideAB = Math.sqrt(Math.pow(pointAX - pointBX, 2) + Math.pow(pointAY - pointBY, 2));
        sideBC = Math.sqrt(Math.pow(pointBX - pointCX, 2) + Math.pow(pointBY - pointCY, 2));
        sideCA = Math.sqrt(Math.pow(pointAX - pointCX, 2) + Math.pow(pointAY - pointCY, 2));
    }
}
