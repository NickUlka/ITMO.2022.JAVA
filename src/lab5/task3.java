package lab5;

public class task3 {
    public static void main(String[] args) {
        String text = "бяка,как прекрасен этот мир, бяка";
        String badWord = "бяка";
        String wordToChange = "[вырезано цензурой]";
        if (text.equals(ChangeBadWord(text, badWord, wordToChange))) {
            System.out.println("В строке нет нецензурных слов");
        } else {
            System.out.println(ChangeBadWord(text, badWord, wordToChange));
        }

    }

    public static String ChangeBadWord(String text, String badWord, String wordToChange) {
        int index = text.indexOf(badWord);
        if (index >= 0) {
            text = text.replaceAll(badWord, wordToChange);
        }
        return text;
    }
}


