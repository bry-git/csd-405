import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

public class Scratch {
    public static void main(String[] args) {
        try {
            File tempDir = new File(System.getProperty("user.dir"));
            System.out.println(tempDir.getAbsolutePath());
            File f = new File("foo.txt");
            f.createNewFile();

            FileWriter fw = new FileWriter("foo.txt");
            fw.write("bar\nbas");
            fw.close();

            Scanner reader = new Scanner(f);
            while(reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }
        }
        catch (IOException e) {
            System.out.println("error creating new file");
        }
    }
}

//        try {
//            File f = new File("foo.txt");
//            f.createNewFile();
//          }
//        catch (IOException e) {
//            System.out.println("error creating new file");
//        }
//
//        try {
//            File tempDir=new File(System.getProperty("user.dir"));
//            System.out.println(tempDir.getAbsolutePath());
//            File f=new File("foo.txt");
//            f.createNewFile();
//        }
//        catch(IOException e) {
//                System.out.println("error creating new file");
//        }
