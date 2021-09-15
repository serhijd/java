/* 2021-09-15
 * HomeWork 08-01
 * Sergiy Dolnyy
 * Create Triangle
 */
package org.example;


public class Main
{
    public static void main( String[] args )
    {
        System.out.println( "HomeWork 08-01" );
        Shape circle = new Circle(3,5,8);
        System.out.println(circle);
        circle.move(3,-2);
        System.out.println(circle);
    }
}
