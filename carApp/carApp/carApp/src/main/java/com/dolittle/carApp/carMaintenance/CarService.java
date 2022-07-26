package com.dolittle.carApp.carMaintenance;

import java.util.List;

import com.dolittle.carApp.carMaintenance.model.CarTO;

public interface CarService {

    List<CarTO> getAllCars();

    void createCar(CarEntity car);

    void deleteCar(Long id);

    void updateCar(Long id, CarEntity car);

}
