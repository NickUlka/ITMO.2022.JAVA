package lab.Thread.task4;

public class Main {
    public static void main(String[] args) {
        Object object = new Object();
        new Threads(object).start();
        new Threads(object).start();
    }
}