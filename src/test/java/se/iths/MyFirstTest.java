package se.iths;

import junit.lab.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class MyFirs
        tTest {

    Calculator myCalculator = new Calculator();
    @Test

    public void myVeryFirstTest(){


       int substractionResult = myCalculator.substract(200,2);

        Assert.assertEquals( 198, substractionResult);
    }

    @Test
public void percentageOfPositiveNumber(){
    Assert.assertEquals(
             50,
        myCalculator.percent(50, 100),
        0);
    }
    @Test
    public void percentageOfZero() {
        Assert.assertTrue(

                Double.isInfinite(
                        myCalculator.percent(50, 0)
                )
        );
    }

        @Test
        public void divisionByZero(){
            try {
                myCalculator.divide(100, 0);

            } catch (ArithmeticException e) {
                return;
            }
            Assert.fail();
        }
        @Test
        public void divisionByNegative() {
            Assert.assertEquals(
                    -2,
                    myCalculator.divide(4, -2)

            );
        }
}








