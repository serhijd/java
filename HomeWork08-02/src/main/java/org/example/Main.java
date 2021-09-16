/* 2021-09-15
 * HomeWork 08-02
 * Sergiy Dolnyy
 * Create Car
 */
package org.example;

import java.time.LocalDate;

public class Main
{
    public static void main( String[] args )
    {
        System.out.println( "HomeWork 08-02" );

        Person person = new Person("John","Dow",
                LocalDate.of(1980,2,4),
                Person.Gender.MALE);
        System.out.println(person);

        DrivingLicense license = new DrivingLicense(person, DrivingLicense.VehicleType.B,
                LocalDate.of(2000,5,20),
                LocalDate.of(2030,5,20),
                "AA 12345678");
        System.out.println(license);

        Driver driver = new Driver(person,license);
        System.out.println(driver);
    }
}
