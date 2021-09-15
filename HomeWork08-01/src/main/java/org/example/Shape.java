package org.example;

import java.text.DecimalFormat;

public abstract class Shape {
    public abstract double square();
    public abstract double perimeter();
    public abstract void move(double dx, double dy);

    @Override
    public String toString(){
        DecimalFormat df = new DecimalFormat("#.##");
        return ", perimeter = "+df.format(perimeter())+", square = "+df.format(square());
    }
}
