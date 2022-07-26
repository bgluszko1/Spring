package com.dolittle.carApp.model;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public class ClientTO {

    private Long id;
    private String name;
    private String surname;
    private String residency;
    private LocalDate dateOfBirth;
    private String phoneNumber;
    private String creditCardNumber;

    public ClientTO(Long id, String name, String surname, String residency, LocalDate dateOfBirth, String phoneNumber, String creditCardNumber) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.residency = residency;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.creditCardNumber = creditCardNumber;
    }

}
