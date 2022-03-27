/**
 * bryson crandall
 * 25 march
 * csd405 module 3
 * */

package test;

import com.csd405.BrysonInteger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BrysonIntegerTest {

    @Test
    void hasProperties() {
        BrysonInteger testObj = new BrysonInteger(1);
        assertEquals(testObj.getBryson(), 1);
    }

    @Test
    void setProperties() {
        BrysonInteger testObj = new BrysonInteger(1);
        testObj.setBryson(2);
        assertEquals(testObj.getBryson(), 2);
    }

    @Test
    void isEven() {
        BrysonInteger testObj = new BrysonInteger(1);
        assertFalse(testObj.isEven());

        testObj.setBryson(2);
        assertTrue(testObj.isEven());

        assertTrue(BrysonInteger.isEven(4));
        assertFalse(BrysonInteger.isEven(5));

        Integer i = 5;
        assertFalse(BrysonInteger.isEven(i));
        i++;
        assertTrue(BrysonInteger.isEven(i));

        testObj.setBryson(0);
        assertTrue(testObj.isEven());
    }

    @Test
    void isOdd() {
        BrysonInteger testObj = new BrysonInteger(1);
        assertTrue(testObj.isOdd());

        testObj.setBryson(2);
        assertFalse(testObj.isOdd());

        assertTrue(BrysonInteger.isOdd(5));
        assertFalse(BrysonInteger.isOdd(4));

        Integer i = 6;
        assertFalse(BrysonInteger.isOdd(i));
        i++;
        assertTrue(BrysonInteger.isOdd(i));

        testObj.setBryson(0);
        assertFalse(testObj.isOdd());
    }

    @Test
    void isPrime() {
        BrysonInteger testObj = new BrysonInteger(37);
        assertTrue(testObj.isPrime());

        testObj.setBryson(38);
        assertFalse(testObj.isPrime());

        assertTrue(BrysonInteger.isPrime(29));
        assertFalse(BrysonInteger.isPrime(33));

        Integer i = 10;
        assertFalse(BrysonInteger.isPrime(i));
        i++;
        assertTrue(BrysonInteger.isPrime(i));

        testObj.setBryson(0);
        assertFalse(testObj.isPrime());
    }
}
