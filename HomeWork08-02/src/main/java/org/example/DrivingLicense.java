package org.example;

import java.time.LocalDate;

public class DrivingLicense implements PersonLicense{
    private PersonLicense person;
    private VehicleType category;
    private LocalDate issued;
    private LocalDate expires;
    private String number;

    public enum VehicleType {A, B, C, D, E}

    public DrivingLicense(PersonLicense person, VehicleType category, LocalDate issued, LocalDate expires, String number) {
        this.person = person;
        this.category = category;
        this.issued = issued;
        this.expires = expires;
        this.number = number;
    }

    @Override
    public String firstName() {
        return null;
    }

    @Override
    public String lastName() {
        return null;
    }

    @Override
    public LocalDate birthday() {
        return null;
    }


}
