/**
 * Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
 * менять колесо, вывести на консоль марку автомобиля.
 */

package com.epam.module_4.aggregation_and_composition.task_2;

import java.util.Arrays;

public class Car {

    private final String carModel;
    private Engine engine;
    private Wheel[] wheels;

    public Car(Engine engine, Wheel wheel, int numberOfWheels, String carModel) {
        this.engine = engine;
        this.wheels = new Wheel[numberOfWheels];
        Arrays.fill(wheels, wheel);
        this.carModel = carModel;
    }

    public Car() {
        engine = new Engine();
        wheels = new Wheel[4];
        carModel = "Lada";
    }

    private void go() {
        while (engine.getFuel() > 0) {
            engine.fuelCombastion();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {}
        }

        stop();
    }

    private void stop() {
        engine.setEngineRunning(false);
        for (int i = 0; i < wheels.length; i++) {
            wheels[i].setSpinning(false);
        }
    }

    private void refuel() {
        stop();
        engine.setFuel(100);
    }

    public String getCarModel() {
        return carModel;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheel wheel) {
        Arrays.fill(wheels, wheel);
    }
}
