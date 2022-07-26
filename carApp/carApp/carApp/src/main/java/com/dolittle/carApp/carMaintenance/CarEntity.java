package com.dolittle.carApp.carMaintenance;

import com.dolittle.carApp.employeeMaintenance.EmployeeEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Collection;

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
    @ManyToMany
    private Collection<EmployeeEntity> employees;


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

    public void setEmployees(Collection<EmployeeEntity> employees) {
        this.employees = employees;
    }
}


