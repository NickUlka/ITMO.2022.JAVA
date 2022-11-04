package lab10;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class task4 {
    public static void main(String[] args) {
        String string = "files/lab10Task4.txt";
replaceInFile(string);
    }

    static void replaceInFile(String string) {
        String search = "[^a-zA-Zа-яёА-ЯЁ0-9 ]";
        String replace = "\\$";
        Charset charset = StandardCharsets.UTF_8;
        Path path = Paths.get(string);
        try {
            Files.write(path, new String(Files.readAllBytes(path), charset).replaceAll(search, replace).getBytes(charset));
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}




