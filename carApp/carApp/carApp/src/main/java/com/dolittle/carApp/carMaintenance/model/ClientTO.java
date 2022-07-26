package com.dolittle.carApp.carMaintenance.model;

import java.util.Date;

public class ClientTO {
    private String name;
    private String surname;
    private String residency;
    private Date dateOfBirth;
    private String phoneNumber;
    private String creditCardNumber;

    public ClientTO(String name, String surname, String residency, Date dateOfBirth, String phoneNumber, String creditCardNumber) {
        this.name = name;
        this.surname = surname;
        this.residency = residency;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.creditCardNumber = creditCardNumber;
    }

}
