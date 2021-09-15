package org.example;

public class Triangle extends Shape{
    private Point pointA;
    private Point pointB;
    private Point pointC;

    public Triangle(Point pointA, Point pointB, Point pointC){
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
    }

    public Triangle(double x1, double y1, double x2,
                    double y2, double x3, double y3){
        this.pointA = new Point(x1,y1);
        this.pointB = new Point(x2,y2);
        this.pointC = new Point(x3,y3);
    }


    @Override
    public double square() {
        return (pointA.getX() * pointB.getY()
                + pointB.getX() * pointC.getY()
                + pointC.getX() * pointA.getY()
                - pointA.getX() * pointC.getY()
                - pointB.getX() * pointA.getY()
                - pointC.getX() * pointB.getY()) / 2.0;
    }

    @Override
    public double perimeter() {
        return Math.sqrt(
                Math.pow(pointB.getX() - pointA.getX(),2)
                + Math.pow(pointB.getY() - pointA.getY(),2))

                + Math.sqrt(
                Math.pow(pointC.getX() - pointB.getX(),2)
                + Math.pow(pointC.getY() - pointB.getY(),2))

                + Math.sqrt(
                Math.pow(pointA.getX() - pointC.getX(),2)
                + Math.pow(pointA.getY() - pointC.getY(),2)
                );
    }

    @Override
    public void move(double dx, double dy) {
        System.out.print("Triangle moves from "
                + pointA + " " + pointB + " " + pointC);
        pointA.setX(pointA.getX()+dx);
        pointA.setY(pointA.getY()+dy);
        pointB.setX(pointB.getX()+dx);
        pointB.setY(pointB.getY()+dy);
        pointC.setX(pointC.getX()+dx);
        pointC.setY(pointC.getY()+dy);
        System.out.println(" to" + pointA + " "
                + pointB + " " + pointC);
    }

    @Override
    public String toString() {
        return "Triangle [" + pointA
                + pointB + pointC + "]"
                + super.toString();
    }

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }
}
