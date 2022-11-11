package lab.Thread.task3;

public class Main {
    public static void main(String[] args) {
        Count count = new Count();
        for (int i = 1; i < 101; i++) {
            CountThread countThread = new CountThread(count);
            countThread.start();
            try {
                countThread.join();
                System.out.println("Счетчик " + i+ " равен " + + count.getCount());
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
