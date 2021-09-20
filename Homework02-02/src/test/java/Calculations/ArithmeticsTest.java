package Calculations;

import org.junit.*;
import static org.junit.Assert.*;

import org.junit.function.ThrowingRunnable;
import org.junit.internal.runners.statements.ExpectException;
import java.rmi.UnexpectedException;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;



public class ArithmeticsTest {
    private static Arithmetics a;

    @BeforeClass
    public static void init(){
        a = new Arithmetics();
    }

//    @AfterClass
//    public static void done() {
//        // method to be called after each of test methods
//    }

    @Rule //deprecated in JUnit 4.13
    public final ExpectedException expException = ExpectedException.none();

    @Rule
    //public final Timeout tOut = new Timeout(1000);
    public final Timeout tOut = new Timeout(100L, TimeUnit.MILLISECONDS);

    @Test
    public void add() {
        double result;
        //Arithmetics a = new Arithmetics();
        result = a.add(3,7);
        //if (result !=10.0) Assert.fail("Add fails");
        assertEquals("Add doubles failed",10,result,0.001);
    }

    @Test
    public void deduct() {
        double result;
//        Arithmetics a = new Arithmetics();
        result = a.deduct(7,3);
        assertEquals("Deduct doubles failed",4.0,result,0.001);
    }

    @Test
    public void mult() {
        double result;
//        Arithmetics a = new Arithmetics();
        result = a.mult(7,3);
        assertEquals("Multiply doubles failed",21.0,result,0.001);
    }
//    @Ignore
    @Test
    public void div() {
        double result;
//        Arithmetics a = new Arithmetics();
        result = a.div(21,3);
        assertEquals("Divide doubles failed",7.0,result,0.001);
//        try {
//            a.div(21,0);
//            Assert.fail("Divide by 0");
////          assertThrows("Divide by 0",Exception,);
//        } catch (Exception e){
//
//        }
    }

    @Test(expected = ArithmeticException.class)
    public void divException() {
        a.div(21,0);
    }

    @Test   //deprecated in JUnit 4.13
    public void divExceptionRule() {
        expException.expect(ArithmeticException.class);
        a.div(21,0);
    }

    @Ignore
//    @Test (timeout=10) //time in ms
    @Test
    public void testTimeout(){
        double result = 0;
        for (int i = 0; i < 1000000000; i++){
            result = a.add(result,i);
        }
    }

}