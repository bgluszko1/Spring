package com.dolittle.carApp.employeeMaintenance;

import com.dolittle.carApp.PlaceMaintenance.PlaceEntity;
import com.dolittle.carApp.model.Position;
import lombok.Getter;

import javax.persistence.*;

@Getter
@Entity
public class EmployeeEntity {

    @Id
    private Long id;
    private Position position;
    @ManyToOne
    private PlaceEntity placeId;

    public EmployeeEntity(Long id, Position position, PlaceEntity placeId) {
        this.id = id;
        this.position = position;
        this.placeId = placeId;
    }

    protected EmployeeEntity() {

    }
}
