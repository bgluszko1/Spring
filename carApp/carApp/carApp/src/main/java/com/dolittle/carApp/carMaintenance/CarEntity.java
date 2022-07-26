package com.dolittle.carApp.carMaintenance;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class CarEntity {

    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private Long id;
    private String model;
    private int yearOfProduction;
    private String color;
    private int engineCapacity;
    private int enginePower;
    private Long mileage;


    public CarEntity(String model, int yearOfProduction,
                     String color, int engineCapacity, int enginePower, Long mileage) {
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.color = color;
        this.engineCapacity = engineCapacity;
        this.enginePower = enginePower;
        this.mileage = mileage;
    }

    protected CarEntity() {

    }
}


