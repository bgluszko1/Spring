package com.dolittle.carApp.carMaintenance;

import java.util.List;
import java.util.stream.Collectors;

import com.dolittle.carApp.employeeMaintenance.EmployeeEntity;
import com.dolittle.carApp.model.CarTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarDAO carDAO;

    @Override
    public List<CarTO> getAllCars() {
        return carDAO.findAll().stream().map(this::mapToCarTO).collect(Collectors.toList());
    }

    @Override
    public void addCar(CarEntity car) {
        carDAO.save(car);
    }
    @Override
    public void updateCar(Long id, CarEntity car) {
        carDAO.save(car);
    }

    @Override
    public void assignEmployee(EmployeeEntity employeeId, CarTO car) {
        car.getEmployees().add(employeeId);
    }

    @Override
    public void deleteCar(Long id) {
        if(carDAO.existsById(id)) {
            carDAO.deleteById(id);
        }
        else {
            throw new IllegalArgumentException("Car doesnt exist!");
        }
    }

    @Override
    public List<CarTO> getCarsByModel(String model) {
        return carDAO.findAll().stream()
                .map(this::mapToCarTO).filter(c -> c.getModel().equals(model))
                .collect(Collectors.toList());
    }

    @Override
    public List<CarTO> getCarsByEmployee(Long employeeId) {
        return carDAO.findAll().stream()
                .map(this::mapToCarTO).filter(c -> c.getEmployees().contains(employeeId))
                .collect(Collectors.toList());
    }

    private CarTO mapToCarTO(CarEntity carEntity) {
        return new CarTO(carEntity.getId(), carEntity.getModel(), carEntity.getYearOfProduction(),
                carEntity.getColor(), carEntity.getEngineCapacity(), carEntity.getEnginePower(),
                carEntity.getMileage(), carEntity.getEmployees());
    }
}
