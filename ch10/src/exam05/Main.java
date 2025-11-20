package exam05;

import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {
        File file = new File("Temp.txt");
        int ch;
        try {
            FileReader reader = new FileReader("Temp.txt");
            ch = reader.read();
        }
        catch (Exception e) {
            System.out.println("Error!!!");
        }

        FileOutputStream os = new FileOutputStream("Temp.txt");
        os.write(123);
    } catch (Exception e) {
        e.printStackTrace();
        
    }

}