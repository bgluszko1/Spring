package com.dolittle.carApp.employeeMaintenance;

import com.dolittle.carApp.PlaceMaintenance.PlaceEntity;
import com.dolittle.carApp.carMaintenance.CarEntity;
import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

enum Position {
    SPRZEDAWCA,
    KIEROWNIK,
    KSIEGOWY
}
@Getter
@Entity
public class EmployeeEntity {


    @Id
    private Long id;
    private Position position;
    @ManyToOne
    private PlaceEntity placeId;
    @ManyToMany
    private Collection<CarEntity> cars;

    @ManyToMany
    @JoinTable(name = "employee_entity_employee_entity",
            joinColumns = @JoinColumn(name = "employee_entity_id", referencedColumnName = "employee_entity_id"))
    private Collection<CarEntity> carEntities = new ArrayList<>();

    public void setCarEntities(Collection<CarEntity> carEntities) {
        this.carEntities = carEntities;
    }

    public Long getId() {
        return id;
    }
}
