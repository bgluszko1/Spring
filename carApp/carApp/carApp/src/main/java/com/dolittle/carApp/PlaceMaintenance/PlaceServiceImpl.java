package com.dolittle.carApp.PlaceMaintenance;

import com.dolittle.carApp.model.PlaceTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PlaceServiceImpl implements PlaceService{

    @Autowired
    private PlaceDAO placeDAO;

    @Override
    public List<PlaceTO> getAllPlaces() {
        return placeDAO.findAll().stream().map(this::mapToPlaceTO).collect(Collectors.toList());

    }

    private PlaceTO mapToPlaceTO(PlaceEntity placeEntity) {
        return new PlaceTO(placeEntity.getId(), placeEntity.getCity(),
                placeEntity.getStreet(), placeEntity.getPhoneNumber());
    }

    @Override
    public void addPlace(PlaceEntity place) { placeDAO.save(place);}

    @Override
    public void deletePlace(Long id) { placeDAO.deleteById(id);}
}
