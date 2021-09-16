package org.example;

public class Battery implements CarBattery{
    private int mAhCapacity;
    private String model;
    private String brand;

    public Battery(int mAhCapacity, String model, String brand) {
        this.mAhCapacity = mAhCapacity;
        this.model = model;
        this.brand = brand;
    }

    @Override
    public int mAhCapacity() {
        return this.mAhCapacity;
    }

    public int getmAhCapacity() {
        return mAhCapacity;
    }

    public void setmAhCapacity(int mAhCapacity) {
        this.mAhCapacity = mAhCapacity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Battery{" +
                "mAhCapacity=" + mAhCapacity +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
