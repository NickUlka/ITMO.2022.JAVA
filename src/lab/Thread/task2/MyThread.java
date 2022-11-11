package lab.Thread.task2;

public class MyThread extends Thread {


    @Override
    public  void run() {
       System.out.println("Состояние потока во время выполнения -" + getState());
    }
}
