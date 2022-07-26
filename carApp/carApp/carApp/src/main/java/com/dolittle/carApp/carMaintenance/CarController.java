package com.dolittle.carApp.carMaintenance;

import com.dolittle.carApp.carMaintenance.model.CarTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@RestController
public class CarController {


    @Autowired
    private CarService carService;
    @GetMapping("/carInitialize")
    public void initializeDatabase() {
        CarEntity car = new CarEntity("Golf", 2022,
                "czarny", 15, 1888, 123L);
        carService.createCar(car);
    }

    @PutMapping("cars/update/{id}")
    public void updateCar(@PathVariable("id") Long id, CarEntity car) {
        carService.updateCar(id, car);
    }

    @GetMapping("/cars")
    public List<CarTO> getAllCars() {
        return carService.getAllCars();
    }

    @DeleteMapping(path = "/cars/delete/{id}")
    public void deleteCars(@PathVariable("id") Long id) {
        carService.deleteCar(id);
    }
}
