/**
 * bryson crandall
 * 25 march
 * csd405 module 3
 * */

package com.csd405;

public class BrysonInteger {
    int bryson;

    public BrysonInteger(Integer initialValue) {
        this.bryson = initialValue;
    }

    public int getBryson() {
        return bryson;
    }

    public void setBryson(int bryson) {
        this.bryson = bryson;
    }

    public boolean isEven() {
        return (this.bryson % 2 == 0);
    }

    public static boolean isEven(int value) {
        return (value % 2 == 0);
    }

    public static boolean isEven(Integer value) {
        return (value % 2 == 0);
    }

    public boolean isOdd() {
        return (this.bryson % 2 != 0);
    }

    public static boolean isOdd(int value) {
        return (value % 2 != 0);
    }

    public static boolean isOdd(Integer value) {
        return (value % 2 != 0);
    }

    public boolean isPrime() { //https://www.geeksforgeeks.org/java-program-to-check-if-a-number-is-prime-or-not/
        if (this.bryson <= 1)
            return false;
        for (int i = 2; i < this.bryson; i++)
            if (this.bryson % i == 0) {
                return false;
            }
        return true;
    }

    public static boolean isPrime(int value) {
        if (value <= 1) {
            return false;
        }
        for (int i = 2; i < value; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrime(Integer value) {
        if (value <= 1) {
            return false;
        }
        for (int i = 2; i < value; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }
}
