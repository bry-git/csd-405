
/**
 * bryson crandall
 * 18 march
 * csd405 module 1
 * */

package com.csd405;

import static org.junit.jupiter.api.Assertions.*;

class FanTest {

    @org.junit.jupiter.api.Test
    void getDefaultFan() {
        Fan fan = new Fan();
        assertEquals(fan.getSpeed(), Fan.Mode.STOPPED.ordinal());
        assertFalse(fan.isOn());
        assertEquals(fan.getRadius(), 6);
        assertEquals(fan.getColor(), "white");
    }

    @org.junit.jupiter.api.Test
    void getSpecificFan() {
        Fan fan = new Fan(
                Fan.Mode.FAST.ordinal(),
                true,
                8,
                "blue"
                );
        assertEquals(fan.getSpeed(), Fan.Mode.FAST.ordinal());
        assertTrue(fan.isOn());
        assertEquals(fan.getRadius(), 8);
        assertEquals(fan.getColor(), "blue");
    }

    @org.junit.jupiter.api.Test
    void getStringOfFan() {
        Fan fan = new Fan();
        assertEquals(fan.toString(), "Fan{" +
                "speed=" + Fan.Mode.STOPPED.ordinal() +
                ", on=" + fan.isOn() +
                ", radius=" + fan.getRadius() +
                ", color='" + fan.getColor() + '\'' +
                '}');
    }
}