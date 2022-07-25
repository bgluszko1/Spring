package com.dolittle.carApp.carMaintenance.model;

public class CarTO {
    private String model;
    private long id;

    public CarTO(long id, String model) {
        this.model = model;
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public long getId() {
        return id;
    }

}
