package com.dolittle.carApp.PlaceMaintenance;

import com.dolittle.carApp.model.PlaceTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlaceController {

    @Autowired
    private PlaceService placeService;

    @GetMapping("/placeInitialize")
    public void initializePlaceDatabase() {
        PlaceEntity place = new PlaceEntity();
        placeService.addPlace(place);
    }

    @GetMapping("/places")
    public List<PlaceTO> getAllPlaces() {
        return placeService.getAllPlaces();
    }
}
