package org.example;

import java.time.LocalDate;

public  class Driver {
    private PersonDriver person;
    private DriverLicense license;

    public Driver(PersonDriver person, DriverLicense license) {
        this.person = person;
        this.license = license;
    }

    public PersonDriver getPerson() {
        return person;
    }

    public void setPerson(PersonDriver person) {
        this.person = person;
    }

    public DriverLicense getLicense() {
        return license;
    }

    public void setLicense(DriverLicense license) {
        this.license = license;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "person=" + person +
                ", license=" + license +
                '}';
    }
}
