package lab5;

public class task2 {
    public static void main(String[] args) {
        String word = "Кабак";
        if (palindrom(word)) {
    System.out.println("Слово - "+word+" - палиндром");
        }
        else {System.out.println("Слово - "+word+" не является палиндромом");}
    }

    public static boolean palindrom(String word) {
        String stringRev = new StringBuilder(word).reverse().toString();
        return word.equalsIgnoreCase(stringRev);
    }
}
