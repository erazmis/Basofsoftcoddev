/**
 * Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
 * менять колесо, вывести на консоль марку автомобиля.
 */

package com.epam.module_4.aggregation_and_composition.task_2;

public class Engine {

    private boolean isEngineRunning;
    private int fuel;

    public Engine() {
        isEngineRunning = false;
        fuel = 100;
    }

    public Engine(boolean isEngineRunning, int fuel) {
        this.isEngineRunning = isEngineRunning;
        this.fuel = fuel;
    }

    public boolean isEngineRunning() {
        return isEngineRunning;
    }

    public void setEngineRunning(boolean engineRunning) {
        isEngineRunning = engineRunning;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public void fuelCombastion() {
        fuel--;
    }
}
