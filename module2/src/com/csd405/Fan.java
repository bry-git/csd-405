/**
 * bryson crandall
 * 18 march
 * csd405 module 1
 * */

package com.csd405;

public class Fan {
    public enum Mode {
        STOPPED,
        SLOW,
        MEDIUM,
        FAST
    }
    private int speed;
    private boolean on;
    private int radius;
    private String color;

    public Fan() {
        this.speed = Mode.STOPPED.ordinal();
        this.on = false;
        this.radius = 6;
        this.color = "white";
    }

    public Fan(
            int speed,
            boolean on,
            int radius,
            String color
    ) {
        this.speed = speed;
        if (speed == 0) {
            this.on = false;
        } else if (speed > 0) {
            this.on = true; }
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Fan{" +
                "speed=" + speed +
                ", on=" + on +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
