package com.dolittle.carApp.carMaintenance;

import java.util.List;
import java.util.stream.Collectors;

import com.dolittle.carApp.employeeMaintenance.EmployeeDAO;
import com.dolittle.carApp.model.CarTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarDAO carDAO;

    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    public List<CarTO> getAllCars() {
        return carDAO.findAll().stream().map(this::mapToCarTO).collect(Collectors.toList());
    }

    @Override
    public void addCar(CarTO car) {
        carDAO.save(mapToCarEntity(car));
    }
    @Override
    public void updateCar(Long id, CarTO car) {
        carDAO.save(mapToCarEntity(car));
    }

    @Override
    public void assignEmployee(Long employeeId, Long carId) {
//        getEmployees().add(employeeDAO.getReferenceById(employeeId));
        carDAO.findById(carId).get().getEmployees().add(employeeDAO.getReferenceById(employeeId));
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

    private CarEntity mapToCarEntity(CarTO carTO) {
        return new CarEntity(carTO.getId(), carTO.getModel(), carTO.getYearOfProduction(),
                carTO.getColor(), carTO.getEngineCapacity(), carTO.getEnginePower(),
                carTO.getMileage(), carTO.getEmployees());
    }
}
