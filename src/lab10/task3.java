package lab10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;


public class task3 {
    public static void main(String[] args) {
        String fileInput = "files/lab10Task2.txt";
writeString(stringFromFile(fileInput));

    }



    static String stringFromFile(String string) {
        String stringReader="";
        File file = new File(string);
        try (BufferedReader reader = new BufferedReader(new FileReader(file))){
            stringReader = reader.readLine();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return stringReader;
    }

    static void writeString(String string) {
        try {
            Files.writeString(Paths.get("files/text.txt"), string, StandardOpenOption.APPEND);
        } catch(IOException e){
            System.err.println(e.getMessage());
        }
    }
}
