package lab.Thread.task1;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            new Threads().start();
        }
    }
}
