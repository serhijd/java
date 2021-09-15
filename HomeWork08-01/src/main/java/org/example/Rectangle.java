package org.example;

import java.text.DecimalFormat;

public class Rectangle extends Shape{
    private Point topLeft;
    private Point bottomRight;

    public Rectangle(Point topLeft, Point bottomRight){
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }
    public Rectangle (double x1, double y1, double x2, double y2){
        this.topLeft = new Point(x1,y1);
        this.bottomRight = new Point(x2,y2);
    }

    @Override
    public double square() {
        return Math.abs(bottomRight.getX()-topLeft.getX())
                * Math.abs(topLeft.getY()- bottomRight.getY());
    }

    @Override
    public double perimeter() {
//        return 2.*(Math.abs(bottomRight.getX() - topLeft.getX())
//                + Math.abs(bottomRight.getY() - topLeft.getY()));


        return 2.0 * (Math.abs(bottomRight.getX()-topLeft.getX())
                + Math.abs(topLeft.getY()- bottomRight.getY()));
    }

    @Override
    public void move(double dx, double dy) {
        System.out.print("Rectangle moves from "+topLeft+" "+bottomRight);
        topLeft.setX(topLeft.getX()+dx);
        topLeft.setY(topLeft.getY()+dy);
        bottomRight.setX(bottomRight.getX()+dx);
        bottomRight.setY(bottomRight.getY()+dy);
        System.out.println(" to"+topLeft+bottomRight);
    }

    @Override
    public String toString(){
        DecimalFormat df = new DecimalFormat("#.##");
        return "Rectangle top left = " + topLeft
                +", bottom right = " + bottomRight
                + super.toString();
//                +", square = " + df.format(square())
//                +", perimeter = " + df.format(perimeter());
    }

}
