package com.dolittle.carApp.PlaceMaintenance;

import com.dolittle.carApp.model.PlaceTO;
import com.dolittle.carApp.clientMaintenance.ClientEntity;

import java.util.List;

public interface PlaceService {

    List<PlaceTO> getAllPlaces();

    void addPlace(PlaceEntity place);

    void deletePlace(Long id);
}
