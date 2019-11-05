package classroom._02_11_2019.ClassWork;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ClassWork {

    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "myFile.txt";
        File file = new File(fileName);
        FileReader fr = new FileReader(file);
    }
}
