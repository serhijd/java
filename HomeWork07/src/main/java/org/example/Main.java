/*
 * Homework 07
 * Sergiy Dolnyy
 * MVC pattern
 * Create immutable object
 */

package org.example;


public class Main
{
    public static void main( String[] args ) {

        Age age = new Age();
        age.setYear(2000);

        ImmutableStudent student = new ImmutableStudent("Alex",age);
        System.out.println("Alex year = "+student.getAge().getYear());
        student.getAge().setYear(2001);
        System.out.println("Alex year = "+student.getAge().getYear());

/*        ImmutableStudent is01;
        is01 = immutableStudent.setName("Dima");

        System.out.println( immutableStudent.getName() );
        System.out.println( is01.getName() );

 */
    }
}
