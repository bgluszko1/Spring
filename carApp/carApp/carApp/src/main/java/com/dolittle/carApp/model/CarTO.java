package com.dolittle.carApp.model;

import com.dolittle.carApp.employeeMaintenance.EmployeeEntity;
import lombok.Getter;

import java.util.Collection;
import java.util.List;

@Getter
public class CarTO {

    private long id;
    private String model;
    private int yearOfProduction;
    private String color;
    private int engineCapacity;
    private int enginePower;
    private long run;

    private Collection<EmployeeEntity> employees;


    public CarTO(long id, String model, int yearOfProduction, String color, int engineCapacity, int enginePower, long run, Collection<EmployeeEntity> employees) {
        this.id = id;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.color = color;
        this.engineCapacity = engineCapacity;
        this.enginePower = enginePower;
        this.run = run;
        this.employees = employees;
    }
}
