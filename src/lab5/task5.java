package lab5;

public class task5 {
    public static void main(String[] args) {
        System.out.println(reverseText("Как прекрасен этот мир"));
    }


    public static String reverseText(String text) {
        String[] strings = text.split(" ");
        String result = "";
        for (String word : strings) {
            StringBuilder stringRev = new StringBuilder(word).reverse();
            stringRev.append(" ");
            result += stringRev.toString();
        }
        return result.trim();
    }
}

