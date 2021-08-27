/**
 * Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
 * менять колесо, вывести на консоль марку автомобиля.
 */

package com.epam.module_4.aggregation_and_composition.task_2;

public class Wheel {

    private String wheel;
    private static boolean isSpinning;

    public Wheel(String wheel, boolean isSpinning) {
        this.wheel = wheel;
        setSpinning(isSpinning);
    }

    public Wheel() {
    }

    public String getWheel() {
        return wheel;
    }

    public void setWheel(String wheel) {
        this.wheel = wheel;
    }

    public boolean areSpinning() {
        return isSpinning;
    }

    public static void setSpinning(boolean spinning) {
        isSpinning = spinning;
    }
}
