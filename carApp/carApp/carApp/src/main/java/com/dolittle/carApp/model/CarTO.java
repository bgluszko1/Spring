package com.dolittle.carApp.model;

import com.dolittle.carApp.employeeMaintenance.EmployeeEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Collection;

@Getter
@Setter
@NoArgsConstructor
public class CarTO {

    private long id;
    private String model;
    private int yearOfProduction;
    private String color;
    private int engineCapacity;
    private int enginePower;
    private long mileage;

    private Collection<EmployeeEntity> employees;


    public CarTO(long id, String model, int yearOfProduction, String color, int engineCapacity, int enginePower, long mileage, Collection<EmployeeEntity> employees) {
        this.id = id;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.color = color;
        this.engineCapacity = engineCapacity;
        this.enginePower = enginePower;
        this.mileage = mileage;
        this.employees = employees;
    }
}
