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
        age.setYear(1993);

        ImmutableStudent student = new ImmutableStudent("Alex","217",age);
        System.out.println(""+student.getName()
                +" group = "+student.getGroup()
                +" year = "+student.getAge().getYear());

        student.setName("Dmitriy");
        System.out.println(""+student.getName()
                +" group = "+student.getGroup()
                +" year = "+student.getAge().getYear());

        student.setGroup("257");
        System.out.println(""+student.getName()
                +" group = "+student.getGroup()
                +" year = "+student.getAge().getYear());

        student.getAge().setYear(2000);
        System.out.println(""+student.getName()
                +" group = "+student.getGroup()
                +" year = "+student.getAge().getYear());


        student = student.setName("Dmitriy");
        System.out.println(""+student.getName()
                +" group = "+student.getGroup()
                +" year = "+student.getAge().getYear());

        student = student.setGroup("257");
        System.out.println(""+student.getName()
                +" group = "+student.getGroup()
                +" year = "+student.getAge().getYear());

        age.setYear(2000);
        student = student.setAge(age);
        System.out.println(""+student.getName()
                +" group = "+student.getGroup()
                +" year = "+student.getAge().getYear());
    }
}
