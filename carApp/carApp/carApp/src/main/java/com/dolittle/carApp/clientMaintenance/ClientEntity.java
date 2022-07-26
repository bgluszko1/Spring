package com.dolittle.carApp.clientMaintenance;


import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.Date;

@Getter
@Entity
public class ClientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String surname;
    private String residency;
    private LocalDate dateOfBirth;
    private String phoneNumber;
    private String creditCardNumber;

    public ClientEntity(String name, String surname, String residency, LocalDate dateOfBirth, String phoneNumber, String creditCardNumber) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.residency = residency;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.creditCardNumber = creditCardNumber;
    }

    protected ClientEntity() {

    }

}
