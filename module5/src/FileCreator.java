/**
 * Bryson Crandall
 * apr 13
 * csd 405 module 5
 * */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class FileCreator {
    public static File create() {
        File f = new File("data.file");
        if (f.exists()) {
        }
        try {
            FileWriter w = new FileWriter("data.file", true);
            for(int i = 1; i <= 10; i++) {
                w.write(Math.abs(new Random().nextInt()) + " \n");
            }
            w.close();
        } catch (IOException e) {
            System.out.println(e);
        }
        try {
            Scanner reader = new Scanner(f);
            while(reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        return f;
    }
    public static void main(String[] args) {
        create();
    }
}
