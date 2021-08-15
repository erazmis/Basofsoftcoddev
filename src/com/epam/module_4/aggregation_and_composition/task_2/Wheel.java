/**
 * Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
 * менять колесо, вывести на консоль марку автомобиля.
 */

package com.epam.module_4.aggregation_and_composition.task_2;

public class Wheel {

    private String wheels;

    public Wheel(String wheels) {
        this.wheels = wheels;
    }

    public Wheel() {
        wheels = "not spinning";
    }

    public String getWheels() {
        return wheels;
    }

    public void setWheels(String wheels) {
        this.wheels = wheels;
    }
}
