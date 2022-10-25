package lab5;

public class task3 {
    public static void main(String[] args) {
        String string = "Как прекрасен этот мир, бяка";
        String stringReplace = string.replaceAll("бяка", "[вырезано цензурой]");
        System.out.println(stringReplace);
    }
}

