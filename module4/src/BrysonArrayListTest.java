/**
 * Bryson Crandall
 * 8 April
 * CSD405 module 4.2
 * */

import java.util.ArrayList;
import java.util.Scanner;

public class BrysonArrayListTest {

    public BrysonArrayListTest() {
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = generate();
        System.out.println(String.valueOf(max(list)));
        System.out.println(String.valueOf(min(list)));
    }

    public static ArrayList<Integer> generate() {
        ArrayList<Integer> list = new ArrayList<>();
        int input = 0;
        System.out.println("Enter Integers to build an Array list. the input will close when a 0 is entered");
        Scanner s = new Scanner(System.in);
        try {
            while((input = s.nextInt()) != 0) {
                list.add(input);
            }
            System.out.println(String.valueOf(list));
        }
        catch (Exception e) {
            System.out.println(String.valueOf(e) + "not a valid entry");
        }
        return list;
    }

    public static Integer max(ArrayList<Integer> list) {
        Integer max = 0;
        for (Integer i : list) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public static Integer min(ArrayList<Integer> list) {
        Integer min = list.get(0);
        for(Integer i : list) {
            if (i <= min) {
                min = i;
            }
        }
        return min;
    }
}
