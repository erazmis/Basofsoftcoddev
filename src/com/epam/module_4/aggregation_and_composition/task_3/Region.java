/**
 * Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
 * столицу, количество областей, площадь, областные центры.
 */

package com.epam.module_4.aggregation_and_composition.task_3;

public class Region {

    private District[] districts;
    private City regionCenter;

    public Region() {
    }

    public Region(String regionCenter, District ... districts) {
        this.regionCenter = new City(regionCenter);
        this.districts = districts;
    }

    public int getRegionArea() {
        int area = 0;

        for (int i = 0; i < districts.length; i++) {
            area += districts[i].getDistrictArea();
        }

        return area;
    }

    public String getRegionCenter() {
        return regionCenter.toString();
    }


}
