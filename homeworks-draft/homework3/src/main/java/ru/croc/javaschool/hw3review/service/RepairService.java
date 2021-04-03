package ru.croc.javaschool.hw3review.service;

import ru.croc.javaschool.hw3review.model.CanFly;
import ru.croc.javaschool.hw3review.model.EngineVehicle;
import ru.croc.javaschool.hw3review.model.enums.TechnicalState;

public class RepairService {

    public void repairEngineVehicle(EngineVehicle engineVehicle) {
        engineVehicle.setTechnicalState(TechnicalState.STABLE);
    }

    public void repairAircraft(CanFly aircraft) {
        System.out.println("Do some magic things with that aircraft");
    }
}
