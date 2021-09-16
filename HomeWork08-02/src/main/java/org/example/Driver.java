package org.example;

import java.time.LocalDate;
//todo remove abstract
public abstract class Driver implements PersonDriver,DriverLicense{
    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private int age;
    private DriverLicense drivingLicense;
}
