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

        ImmutableStudent student01;
        student01 = student.setName("Dmitriy");
        System.out.println(""+student01.getName()
                +" group = "+student01.getGroup()
                +" year = "+student01.getAge().getYear());

        student01 = student01.setGroup("257");
        System.out.println(""+student01.getName()
                +" group = "+student01.getGroup()
                +" year = "+student01.getAge().getYear());

        age.setYear(2000);
        student01 = student01.setAge(age);
        System.out.println(""+student01.getName()
                +" group = "+student01.getGroup()
                +" year = "+student01.getAge().getYear());

        student01 = student;
        if (student.equals(student01)){
            System.out.println("Studen1 equals to Student");
        }else{
            System.out.println("Studen1 is not equals to Student");
        }
        ImmutableStudent student02 = new ImmutableStudent("Bob", "267", new Age());
        if (student.equals(student02)){
            System.out.println("Studen2 equals to Student");
        }else{
            System.out.println("Studen2 is not equals to Student");
        }
    }
}
