/**
 * bryson crandall
 * 25 march
 * csd405 module 2
 * */

package com.csd405;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FanGenerator {
    public FanGenerator() {}

    public static List<Fan> generate() {
        String[] colors = {"white", "grey", "black", "green", "blue", "purple", "red", "yellow"};
        List<Fan> fanList = new ArrayList<>();

        Random rand = new Random();
        int numberOfFans = rand.nextInt((10 - 1) + 1);

        for (int i = 0; i < numberOfFans; i++) {

            int randSpeed = Math.abs(rand.nextInt()) % 4; //generate a random int in range 0-3
            int randRadius = rand.nextInt(12 - 1) + 1; //random radius 1 - 12
            boolean randStatus = (randRadius % 2 == 0); //random status
            int randColor = Math.abs(rand.nextInt()) % 8; // random index of colors 0 - 8

            Fan fan = new Fan(
                    randSpeed,
                    randStatus,
                    randRadius,
                    colors[randColor]
            );
            fanList.add(fan);
        }
        return fanList;
    }
}
