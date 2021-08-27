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
        if (numberOfWheels % 2 == 0) {
            this.wheels = new Wheel[numberOfWheels];
            Arrays.fill(wheels, wheel);
        }
        this.carModel = carModel;
    }

    public Car() {
        engine = new Engine();
        wheels = new Wheel[4];
        carModel = "Lada";
    }

    public void changeWheel(Wheel newWheel, int wheelNumber) {
        wheels[wheelNumber] = newWheel;
    }

    public void go() {
        while (engine.getFuel() > 0) {
            engine.fuelCombastion();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {}
        }

        stop();
    }

    public void stop() {
        engine.setEngineRunning(false);
        Wheel.setSpinning(false);
    }

    public void refuel() {
        stop();
        engine.refuel();
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

    public void setWheels(Wheel wheel, int numberOfWheels) {

        if (wheels.length == numberOfWheels) {
            Arrays.fill(wheels, wheel);
        }
    }
}
