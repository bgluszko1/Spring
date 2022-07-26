package com.dolittle.carApp.carMaintenance;

import com.dolittle.carApp.model.CarTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarController {


    @Autowired
    private CarService carService;
    @GetMapping("/carInitialize")
    public void initializeCarDatabase() {
        CarEntity car = new CarEntity("Golf", 2022,
                "czarny", 15, 1888, 123L);
        CarEntity car2 = new CarEntity("Volvo", 2022,
                "czarny", 15, 1888, 123L);
        carService.addCar(car);
        carService.addCar(car2);
    }

    @PutMapping("cars/update/{id}")
    public void updateCar(@PathVariable("id") Long id, CarEntity car) {
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

    @DeleteMapping(path = "/cars/delete/{id}")
    public void deleteCar(@PathVariable("id") Long id) {
        carService.deleteCar(id);
    }
}
