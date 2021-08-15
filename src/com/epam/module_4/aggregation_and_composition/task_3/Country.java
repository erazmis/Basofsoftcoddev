/**
 * Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
 * столицу, количество областей, площадь, областные центры.
 */

package com.epam.module_4.aggregation_and_composition.task_3;

public class Country {

    Region[] regions;
    private String capital;

    public Country() {
    }

    public Country(String capital, Region[] regions) {
        this.capital = capital;
        this.regions = regions;
    }

    public int getCountryArea() {
        int area = 0;

        for (int i = 0; i < regions.length; i++) {
            area += regions[i].getRegionArea();
        }

        return area;
    }

    public String getCountryCapital() {
        return capital;
    }

    public String getRegionCenters() {
        StringBuilder centers = new StringBuilder();

        for (int i = 0; i < regions.length; i++) {
            centers.append(regions[i].getRegionCenter() + "\n");
        }

        return centers.toString();
    }

    public int getRegionsNumber() {
        return regions.length;
    }
}
