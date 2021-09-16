package org.example;

import java.time.LocalDate;

public interface DriverLicense {
    String licenseNumber();
    DrivingLicense.VehicleType category();
    LocalDate issued();
    LocalDate expires();
}
