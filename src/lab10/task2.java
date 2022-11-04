package lab10;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class task2 {
    public static void main(String[] args) {
      writeString("Привет!");

    }

    static void writeString(String string) {
        try {
            Files.writeString(Paths.get("files/lab10Task2.txt"), string);
            } catch(IOException e){
                System.err.println(e.getMessage());
            }
        }
    }
