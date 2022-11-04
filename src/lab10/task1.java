package lab10;

import java.io.*;
import java.nio.file.Files;
import java.util.LinkedList;
import java.util.List;

public class task1 {
    public static void main(String[] args) {
        String file ="files/text.txt";
List<String> list = stringListFromFile(file);
        for (String str : list)
            System.out.println(str);
    }

    static List<String> stringListFromFile(String string) {
        List<String> strings = new LinkedList<>();
        try {
            File file = new File(string);
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String input = reader.readLine();
            while (input != null) {
              strings.add(input);
                input = reader.readLine();
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return strings;
        }
    }




