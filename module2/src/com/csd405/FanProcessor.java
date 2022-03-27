/**
 * bryson crandall
 * 25 march
 * csd405 module 2
 * */

package com.csd405;

import java.util.List;

public class FanProcessor {
    public FanProcessor() {}

    public static void processFans(Fan fan) {
        Fan.Mode speed = Fan.Mode.values()[fan.getSpeed()];
        System.out.println("DISPLAYING NEW FAN: \n " +
                "SPEED: " + speed + "\n " +
                "ON: " + fan.isOn() + "\n " +
                "RADIUS: " + fan.getRadius() + "\n " +
                "COLOR: " + fan.getColor() + "\n ");
    }

    public static void processFans(List<Fan> fanList) {
        for (Fan f : fanList) {
            Fan.Mode speed = Fan.Mode.values()[f.getSpeed()];
            System.out.println("DISPLAYING NEW FAN: \n " +
                               "SPEED: " + speed + "\n " +
                               "ON: " + f.isOn() + "\n " +
                               "RADIUS: " + f.getRadius() + "\n " +
                               "COLOR: " + f.getColor() + "\n ");
        }
    }
}
