/* 2021-09-15
 * HomeWork 08-01
 * Sergiy Dolnyy
 * Create Triangle
 */
package org.example;


public class Main
{
    public static void main( String[] args ) {
        System.out.println( "HomeWork 08-01" );
        System.out.println();
        Point point = new Point(3,4);
        System.out.println(point);

        System.out.println();

        Shape circle = new Circle(3,5,8);
        System.out.println(circle);
        circle.move(3,-2);
        System.out.println(circle);

        System.out.println();

        Shape rect = new Rectangle(0,0,5,4);
        System.out.println(rect);
        rect.move(3,2);
        System.out.println(rect);

        System.out.println();

        Shape triangle = new Triangle(1,8,2,1,8,9);
//        Shape triangle = new Triangle(1,8,2,1,5,5);
        System.out.println(triangle);
        triangle.move(5,2);
        System.out.println(triangle);

    }
}
