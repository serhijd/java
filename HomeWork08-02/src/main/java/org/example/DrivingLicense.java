package org.example;

import java.time.LocalDate;

public class DrivingLicense implements DriverLicense, CarType{
    private PersonLicense person;
    private VehicleType category;
    private LocalDate issued;
    private LocalDate expires;
    private String licenseNumber;

    public enum VehicleType {A, B, C, D, E}

    public DrivingLicense(PersonLicense person,
                          VehicleType category,
                          LocalDate issued,
                          LocalDate expires,
                          String licenseNumber) {
        this.person = person;
        this.category = category;
        this.issued = issued;
        this.expires = expires;
        this.licenseNumber = licenseNumber;
    }

    @Override
    public VehicleType category() {
        return category;
    }

    @Override
    public String licenseNumber() {
        return licenseNumber;
    }

    @Override
    public LocalDate issued() {
        return issued;
    }

    @Override
    public LocalDate expires() {
        return expires;
    }

    public PersonLicense getPerson() {
        return person;
    }

    public void setPerson(PersonLicense person) {
        this.person = person;
    }

    public VehicleType getCategory() {
        return category;
    }

    public void setCategory(VehicleType category) {
        this.category = category;
    }

    public LocalDate getIssued() {
        return issued;
    }

    public void setIssued(LocalDate issued) {
        this.issued = issued;
    }

    public LocalDate getExpires() {
        return expires;
    }

    public void setExpires(LocalDate expires) {
        this.expires = expires;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    @Override
    public String toString() {
        return "DrivingLicense{" +
                "person=" + person +
                ", category=" + category +
                ", issued=" + issued +
                ", expires=" + expires +
                ", licenseNumber='" + licenseNumber + '\'' +
                '}';
    }
}
