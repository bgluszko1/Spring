package com.dolittle.carApp.carMaintenance;

import java.util.List;

import com.dolittle.carApp.employeeMaintenance.EmployeeEntity;
import com.dolittle.carApp.model.CarTO;

public interface CarService {

    List<CarTO> getAllCars();

    void addCar(CarEntity car);

    void deleteCar(Long id);

    void updateCar(Long id, CarEntity car);

    void assignEmployee(EmployeeEntity employeeId, CarTO car);

    List<CarTO> getCarsByModel(String model);
    List<CarTO> getCarsByEmployee(Long employeeId);


}
