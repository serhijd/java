package org.example;

public class Car {
    private CarDriver driver;
    private CarBattery carBattery;
    //    private VehicleType vehicleType;
//    public enum VehicleType {A, B, C, D, E}

//    private String registrationPlate;
//    private int weight;
//    private int maxSpeed;
//    private int width;
//    private int lenght;

    public Car(CarDriver driver, CarBattery carBattery) {
        this.driver = driver;
        this.carBattery = carBattery;
    }

    public CarDriver getDriver() {
        return driver;
    }

    public void setDriver(CarDriver driver) {
        this.driver = driver;
    }

    public CarBattery getCarBattery() {
        return carBattery;
    }

    public void setCarBattery(CarBattery carBattery) {
        this.carBattery = carBattery;
    }

    @Override
    public String toString() {
        return "Car{" +
                "driver=" + driver +
                ",\n carBattery=" + carBattery +
                '}';
    }
}