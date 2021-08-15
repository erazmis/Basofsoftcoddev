/**
 * Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
 * столицу, количество областей, площадь, областные центры.
 */

package com.epam.module_4.aggregation_and_composition.task_3;

public class District {

    City[] cities;

    public District() {
    }

    public District(City[] cities) {
        this.cities = cities;
    }

    public int getDistrictArea() {
        int area = 0;

        for (int i = 0; i < cities.length; i++) {
            area += cities[i].getCityArea();
        }

        return area;
    }
}
