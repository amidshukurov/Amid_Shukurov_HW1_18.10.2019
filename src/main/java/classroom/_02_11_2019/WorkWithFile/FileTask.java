package classroom._02_11_2019.WorkWithFile;

import javax.xml.transform.Source;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class FileTask {
    public static ArrayList<String> randomStringOfArray(int length){
        ArrayList<String> arrayOfString = new ArrayList<>();
        Random random = new Random();
        for (int i=0;i<length;i++) {
            String str="";
            for (int j =0;j<random.nextInt(10)+20;j++){
                str=str+(char)(random.nextInt(26)+65);
            }
            arrayOfString.add(str);
        }
        return arrayOfString;
    };

    public static void writeFile(ArrayList<String> origin, String path) throws IOException {
        BufferedWriter bw = new BufferedWriter(
                new FileWriter(
                        new File(path)));
        for (String line: origin) {
            bw.write(line);
            bw.newLine();
        }
        bw.close();
    }


    public static void readFile(String origin) throws IOException {
        BufferedReader br = new BufferedReader(
                new FileReader(
                        new File(origin)));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }
    public static void sortFile(String path) throws IOException {
        BufferedReader br = new BufferedReader(
                new FileReader(
                        new File(path)));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();

    }

    public static void main(String[] args) throws IOException {
        ArrayList<String> printArray = randomStringOfArray(33);
        System.out.println(printArray);
        String path ="data/myFile.txt";
        writeFile(printArray,path);
        readFile(path);

    }

}


