package ru.croc.javaschool.hw3review.service;

import ru.croc.javaschool.hw3review.model.Vehicle;
import ru.croc.javaschool.hw3review.model.enums.RentStatus;

public class RentService {

    public void rent(Vehicle vehicle) {
        vehicle.setRentStatus(RentStatus.RENT);
    }

    public void free(Vehicle vehicle) {
        vehicle.setRentStatus(RentStatus.AVAILABLE);
    }
}
