/**
 * bryson crandall
 * 25 march
 * csd405 module 2
 * */

package com.csd405;

import java.util.List;

public class Main {


   public static void main(String[] args) {
        List<Fan> fanList = FanGenerator.generate();

        System.out.println("DISPLAY FAN COLLECTION");
       FanProcessor.processFans(fanList);

       System.out.println("\n DISPLAY A SINGLE FAN");
       FanProcessor.processFans(fanList.get(fanList.size() / 2));
   }
}
