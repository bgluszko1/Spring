package com.dolittle.carApp.carMaintenance.model;

import lombok.Getter;

@Getter
public class CarTO {
    private String model;
    private long id;
    private int yearOfProduction;
    private String color;
    private int engineCapacity;
    private int enginePower;
    private long run;


    public CarTO(long id, String model, int yearOfProduction, String color, int engineCapacity, int enginePower, long run) {
        this.model = model;
        this.id = id;
        this.yearOfProduction = yearOfProduction;
        this.color = color;
        this.engineCapacity = engineCapacity;
        this.enginePower = enginePower;
        this.run = run;
    }

}
