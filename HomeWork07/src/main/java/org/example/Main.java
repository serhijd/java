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
        ImmutableStudent immutableStudent = new ImmutableStudent("Ivan",new Age());
        immutableStudent.setName("Dima");

        System.out.println( immutableStudent.getName() );
    }
}
