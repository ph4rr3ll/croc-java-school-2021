package ru.croc.javaschool.hw3review.model.aircraft;

import ru.croc.javaschool.hw3review.model.CanFly;
import ru.croc.javaschool.hw3review.model.EngineVehicle;

public class Plane extends EngineVehicle implements CanFly {
    @Override
    public void drive() {
        fly();
    }

    @Override
    public void startEngine() {

    }

    @Override
    public void fly() {

    }
}
