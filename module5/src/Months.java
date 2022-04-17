/**
 * Bryson Crandall
 * apr 16
 * csd 405 module 5
 * */

import java.util.ArrayList;
import java.util.Scanner;

public class Months {
    public static void main(String[] args) {
        ArrayList<String> data = new ArrayList<>();

        ArrayList<String> months = new ArrayList<>();
        months.add("january");
        months.add("febuary");
        months.add("march");
        months.add("april");
        months.add("may");
        months.add("june");
        months.add("july");
        months.add("august");
        months.add("september");
        months.add("october");
        months.add("november");
        months.add("december");
        System.out.println("enter a corresponding number to print that month again:");

        int i = 0;
        try {
            for (String month : months) {
                System.out.println(i + " " + month);
                i++;
            }
            Scanner s = new Scanner(System.in);
            System.out.println(months.get(Integer.parseInt(s.next())));
        } catch(IndexOutOfBoundsException e) {
            System.out.println(String.valueOf(e));
        }
    }
}
