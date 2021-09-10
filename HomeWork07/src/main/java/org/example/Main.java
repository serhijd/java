/*
 * Homework 07
 * Sergiy Dolnyy
 * Create immutable object
 * override equals() and hashCode()
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

        System.out.println("=============== EqualTo student 01 =======================");

        student01 = student;
        System.out.println("Student   "+student.getName()
                +" group = "+student.getGroup()
                +" year = "+student.getAge().getYear());

        System.out.println("Student 2 "+student01.getName()
                +" group = "+student01.getGroup()
                +" year = "+student01.getAge().getYear());

        if (student.equals(student01)){
            System.out.println("Student equals to Student 1");
        }else{
            System.out.println("Student is not equals to Student 1");
        }
        System.out.println(student.hashCode()==student01.hashCode());

        System.out.println("=============== EqualTo student 02 =======================");
        //ImmutableStudent student02 = null;
        age.setYear(1993);
        ImmutableStudent student02;
        student02 = new ImmutableStudent("Alex", "217", age);
        //student02 = student.setName("Alex");
        //student02 = student.setGroup("217");

        student02.getAge().setYear(2000); //it is immutable
        System.out.println("Student   "+student.getName()
                +" group = "+student.getGroup()
                +" year = "+student.getAge().getYear());

        System.out.println("Student 2 "+student02.getName()
                +" group = "+student02.getGroup()
                +" year = "+student02.getAge().getYear());

        if (student.equals(student02)){
            System.out.println("Student equals to Student 2");
        }else{
            System.out.println("Student is not equals to Student 2");
        }
        System.out.println(student.hashCode()==student02.hashCode());

        System.out.println("=============== EqualTo student 03 =======================");
//        age.setYear(2000);
        ImmutableStudent student03 = new ImmutableStudent("Alex", "217", age);
//        student03 = student03.setName("Bob");
        student03 = student03.setGroup("257");
        System.out.println("Student   "+student.getName()
                +" group = "+student.getGroup()
                +" year = "+student.getAge().getYear());

        System.out.println("Student 3 "+student03.getName()
                +" group = "+student03.getGroup()
                +" year = "+student03.getAge().getYear());

        if (student.equals(student03)){
            System.out.println("Student equals to Student 3");
        }else{
            System.out.println("Student is not equals to Student 3");
        }
        System.out.println(student.hashCode()==student03.hashCode());
        System.out.println(student.equals(null));
        System.out.println(student.equals(student));

    }
}
