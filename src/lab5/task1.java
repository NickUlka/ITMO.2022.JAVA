package lab5;

import java.lang.reflect.Array;

public class task1 {
    public static void main(String[] args) {
        String string = "Как прекрасен этот мир";
        System.out.println(longWord(string));
    }

    public static String longWord(String string) {
        String[] words = string.split(" ");
        int maxLength = 0;
        String maxWord="";
        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length();
                 maxWord = word;
            }
        }
      return maxWord;
    }
}
