/**
 * Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
 * менять колесо, вывести на консоль марку автомобиля.
 */

package com.epam.module_4.aggregation_and_composition.task_2;

public class Engine {

    private boolean isEngineRunning;
    private int fuel;
    private static int AMOUNT;

    static {
        AMOUNT = 100;
    }

    public Engine() {
        fuel = AMOUNT;
    }

    public Engine(boolean isEngineRunning, int amount) {
        this.isEngineRunning = isEngineRunning;
        this.fuel = amount;
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

    public void refuel() {
        fuel = AMOUNT;
    }

    public void setFuel(int amount) {
        this.fuel = amount;
    }

    public void fuelCombastion() {
        fuel--;
    }
}
