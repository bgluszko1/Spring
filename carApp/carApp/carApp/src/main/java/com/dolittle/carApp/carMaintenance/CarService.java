package com.dolittle.carApp.carMaintenance;

import java.util.List;

import com.dolittle.carApp.employeeMaintenance.EmployeeEntity;
import com.dolittle.carApp.model.CarTO;

public interface CarService {

    List<CarTO> getAllCars();

    void addCar(CarTO car);

    void deleteCar(Long id);

    void updateCar(Long id, CarTO car);

    void assignEmployee(Long employeeId, Long carId);

    List<CarTO> getCarsByModel(String model);
    List<CarTO> getCarsByEmployee(Long employeeId);


}
