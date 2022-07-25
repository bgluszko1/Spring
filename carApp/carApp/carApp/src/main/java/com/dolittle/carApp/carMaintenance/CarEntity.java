package com.dolittle.carApp.carMaintenance;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CarEntity {

    @Id
    private Long id;
    private String model;

    public CarEntity(Long id, String model) {
        this.id = id;
        this.model = model;
    }

    protected CarEntity() {

    }

    public Long getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

}
