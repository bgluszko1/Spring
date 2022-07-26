package com.dolittle.carApp.model;

import lombok.Getter;

@Getter
public class PlaceTO {

    private Long id;
    private String city;
    private String street;
    private String phoneNumber;

    public PlaceTO(Long id, String city, String street, String phoneNumber) {
        this.id = id;
        this.city = city;
        this.street = street;
        this.phoneNumber = phoneNumber;
    }
}
