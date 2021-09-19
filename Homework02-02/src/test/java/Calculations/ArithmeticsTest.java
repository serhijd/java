package Calculations;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArithmeticsTest {

    @Test
    public void add() {
        double result;
        Arithmetics a = new Arithmetics();
        result = a.add(3,7);
        //if (result !=10.0) Assert.fail("Add fails");
        assertEquals("Add doubles failed",10,result,0.001);
    }

    @Test
    public void deduct() {
        double result;
        Arithmetics a = new Arithmetics();
        result = a.deduct(7,3);
        assertEquals("Deduct doubles failed",4.0,result,0.001);
    }

    @Test
    public void mult() {
        double result;
        Arithmetics a = new Arithmetics();
        result = a.mult(7,3);
        assertEquals("Multiply doubles failed",21.0,result,0.001);
    }

    @Test
    public void div() {
        double result;
        Arithmetics a = new Arithmetics();
        result = a.div(21,3);
        assertEquals("Divide doubles failed",7.0,result,0.001);
    }
}