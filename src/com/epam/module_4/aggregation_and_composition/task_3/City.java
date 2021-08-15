/**
 * Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
 * столицу, количество областей, площадь, областные центры.
 */

package com.epam.module_4.aggregation_and_composition.task_3;

public class City {

    private int area;

    public City() {
    }

    public City(int area) {
        this.area = area;
    }

    public int getCityArea() {
        return area;
    }
}
