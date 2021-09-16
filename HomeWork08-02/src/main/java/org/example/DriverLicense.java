package org.example;

import java.time.LocalDate;

public interface DriverLicense {
    String licenseNumber();
    LocalDate issued();
    LocalDate expires();
    Person.Gender gender();

}
