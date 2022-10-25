package lab5;

public class task5 {
    public static void main(String[] args) {
        reverseText("Как прекрасен этот мир");
    }
    public static void reverseText (String word) {
        String stringRev = new StringBuilder(word).reverse().toString();
       System.out.println(stringRev);
    }
}

