package com.dolittle.carApp.carMaintenance;

import java.util.List;
import java.util.stream.Collectors;

import com.dolittle.carApp.carMaintenance.model.CarTO;
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

    private CarTO mapToCarTO(CarEntity carEntity) {
        return new CarTO(carEntity.getId(), carEntity.getModel());
    }
}
