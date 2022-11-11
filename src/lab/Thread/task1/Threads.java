package lab.Thread.task1;


public class Threads extends Thread {

    @Override
    public void run() {
        for (int i=0; i<101;i++) {
            System.out.printf("Поток %s вывел - %d\n", getName(), i);
        }
        }
}
