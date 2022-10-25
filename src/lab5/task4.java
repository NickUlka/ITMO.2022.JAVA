package lab5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task4 {
    public static void main(String[] args) {
        String string = "kjbbksdcjksdbjkcbsc";
        String substr = "jk";
System.out.printf("Количества повторений подстроки %s в строке %s = %s", substr,string,stringQuantity(string,substr));
    }

    public static int stringQuantity(String string, String substr) {
        Pattern pattern = Pattern.compile(substr);
        Matcher matcher = pattern.matcher(string);
        int i = 0;
        while (matcher.find()) {
            i++;
        }
return i;
    }
}
