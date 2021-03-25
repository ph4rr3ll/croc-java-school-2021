package ru.croc.javaschool.hw3review.model;

import ru.croc.javaschool.hw3review.model.enums.RentStatus;
import ru.croc.javaschool.hw3review.model.enums.TechnicalState;

public abstract class Vehicle {

    private RentStatus rentStatus;

    private TechnicalState technicalState;

    public abstract void drive();

    public RentStatus getRentStatus() {
        return rentStatus;
    }

    public void setRentStatus(RentStatus rentStatus) {
        this.rentStatus = rentStatus;
    }

    public TechnicalState getTechnicalState() {
        return technicalState;
    }

    public void setTechnicalState(TechnicalState technicalState) {
        this.technicalState = technicalState;
    }
}
