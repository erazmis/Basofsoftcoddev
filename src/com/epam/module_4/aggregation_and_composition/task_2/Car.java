/**
 * Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
 * менять колесо, вывести на консоль марку автомобиля.
 */

package com.epam.module_4.aggregation_and_composition.task_2;

public class Car {

    private final String carModel;
    Engine engine;
    Wheel wheels;

    public Car(Engine engine, Wheel wheels, String carModel) {
        this.engine = engine;
        this.wheels = wheels;
        this.carModel = carModel;
    }

    public Car() {
        engine = new Engine();
        wheels = new Wheel();
        carModel = "Lada";
    }

    private void go() {
        while (engine.getFuel() > 0) {
            engine.fuelCombastion();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
            }
        }
        stop();
    }

    private void stop() {
        engine.setEngineRunning(false);
        wheels.setWheels("not spinning");

    }

    private void refuel() {
        stop();
        engine.setFuel(100);
    }
}
