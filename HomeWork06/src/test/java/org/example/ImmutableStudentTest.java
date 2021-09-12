package org.example;

import org.junit.Test;

import static org.junit.Assert.*;


public class ImmutableStudentTest {
    @Test
    public void testReflexive() {
        //object must be equal to itself

        Age age = new Age();
        age.setYear(1993);

        ImmutableStudent student = new ImmutableStudent("Alex","217",age);
        ImmutableStudent student01 = new ImmutableStudent("Alex","217",age);

        assertTrue("x=x",student.equals(student));
    }

    @Test
    public void testSymmeteric(){
        //if objA equels objB, objB must equals objA

        Age age = new Age();
        age.setYear(1993);

        ImmutableStudent student = new ImmutableStudent("Alex","217",age);
        ImmutableStudent student01 = new ImmutableStudent("Alex","217",age);

        assertTrue("x=y and y=x",student.equals(student01)
            && student01.equals(student));
    }

    @Test
    public void testConsistent(){
        //multiple runs of equals must return the same value
        Age age = new Age();
        age.setYear(1993);

        ImmutableStudent student = new ImmutableStudent("Alex","217",age);
        ImmutableStudent student01 = new ImmutableStudent("Alex","217",age);

        boolean test=true;
        for (int i = 0; i<100000000; i++){
            test = test & student.equals(student01);
        }
        assertTrue("x consistency",test);
    }

    @Test
    public void testNull(){
        Age age = new Age();
        age.setYear(1993);

        ImmutableStudent student = new ImmutableStudent("Alex","217",age);

        assertFalse("x=null",student.equals(null));
    }

    @Test
    public void testNotEquals(){
        Age age = new Age();
        age.setYear(1993);

        ImmutableStudent student = new ImmutableStudent("Alex","217",age);
        ImmutableStudent student01 = new ImmutableStudent("Dmitry","217",age);

        assertFalse("x!=y",student.equals(student01));
        assertFalse("y!=x",student01.equals(student));
    }
    @Test
    public void testHashCode() {
        Age age = new Age();
        age.setYear(1993);

        ImmutableStudent student = new ImmutableStudent("Alex","217",age);
        ImmutableStudent student01 = new ImmutableStudent("Dmitry","217",age);
        ImmutableStudent student02 = new ImmutableStudent("Alex","217",age);

        assertTrue("x.hashCode() != y.hashCode() ",student.hashCode() != student01.hashCode());
        assertTrue("x.hashCode() == z.hashCode()",student.hashCode() == student02.hashCode());
    }
}