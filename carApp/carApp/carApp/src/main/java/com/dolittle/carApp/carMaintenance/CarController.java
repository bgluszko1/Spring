package com.dolittle.carApp.carMaintenance;

import com.dolittle.carApp.model.CarTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarController {


    @Autowired
    private CarService carService;

    @PostMapping("/cars")
    public void addCar(CarTO car) {
        carService.addCar(car);
    }
    @PutMapping("cars/update/{id}")
    public void updateCar(@PathVariable("id") Long id, CarTO car) {
        carService.updateCar(id, car);
    }

    @GetMapping("/cars")
    public List<CarTO> getAllCars() {
        return carService.getAllCars();
    }

    @GetMapping("/cars/models/{model}")
    public List<CarTO> getCarsByModel(@PathVariable("model") String model) { return carService.getCarsByModel(model);}

    @GetMapping("/cars/employee/{employeeId}")
    public List<CarTO> getCarsByEmployee(@PathVariable("employeeId") Long employeeId) {
        return carService.getCarsByEmployee(employeeId);
    }
    @PostMapping("/cars/{carId}/assign/{employeeId}")
    public void assignEmployee(@PathVariable("carId") Long carId, @PathVariable("employeeId") Long employeeId) {
        carService.assignEmployee(employeeId, carId);
    }

    @DeleteMapping(path = "/cars/delete/{id}")
    public void deleteCar(@PathVariable("id") Long id) {
        carService.deleteCar(id);
    }
}
