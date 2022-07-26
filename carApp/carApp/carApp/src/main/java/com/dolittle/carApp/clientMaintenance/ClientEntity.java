package com.dolittle.carApp.ClientMaintenance;


import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Getter
@Entity
public class ClientEntity {

    @Id
    private Long id;
    private String name;
    private String surname;
    private String residency;
    private Date dateOfBirth;
    private String phoneNumber;
    private String creditCardNumber;

    public ClientEntity(Long id, String name, String surname, String residency, Date dateOfBirth, String phoneNumber, String creditCardNumber) {
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
