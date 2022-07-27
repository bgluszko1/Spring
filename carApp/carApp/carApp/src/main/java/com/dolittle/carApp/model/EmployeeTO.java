package com.dolittle.carApp.model;

import com.dolittle.carApp.PlaceMaintenance.PlaceEntity;
import lombok.Getter;


@Getter
public class EmployeeTO {

    private Long id;
    private Position position;
    private PlaceEntity placeId;

    public EmployeeTO(Long id, Position position, PlaceEntity placeId) {
        this.id = id;
        this.position = position;
        this.placeId = placeId;
    }

    protected EmployeeTO() {
    }
}
