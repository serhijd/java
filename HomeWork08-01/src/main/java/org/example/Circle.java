package org.example;

import java.text.DecimalFormat;

public class Circle extends Shape{
    private Point center;
    private double radius;

    public Circle(Point center,double radius) throws IllegalArgumentException{
        checkRadius(radius);
        this.center=center;
    }
    public Circle(double x, double y, double radius) throws IllegalArgumentException{
        checkRadius(radius);
        this.center = new Point(x,y);
    }

    private void checkRadius(double radius) throws IllegalArgumentException{
        if (radius <=0) {
            throw new IllegalArgumentException("Radius must be > 0");
        }
        this.radius = radius;
    }

    @Override
    public double square() {
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void move(double dx, double dy) {
        System.out.print("Circle moves from "+
                center);
        center.setX(center.getX()+dx);
        center.setY(center.getY()+dy);
        System.out.println(" to "+ center);
    }

    @Override
    public String toString(){
        DecimalFormat df = new DecimalFormat("#.##");
        return "Circle center = " + center.toString()
                + ", radius = " + df.format(this.radius)
                + super.toString();
//                + ", square = " + df.format(square())
//                + ", perimeter = " + df.format(perimeter());
    }
}
