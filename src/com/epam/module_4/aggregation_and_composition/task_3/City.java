/**
 * Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
 * столицу, количество областей, площадь, областные центры.
 */

package com.epam.module_4.aggregation_and_composition.task_3;

public class City {

    private int area;
    private String name;

    public City(int area, String name) {
        this.area = area;
        this.name = name;
    }

    public City(String name) {
        this.name = name;
    }

    public City() {
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "City: " + name +
                "\nArea:" + area;
    }
}
