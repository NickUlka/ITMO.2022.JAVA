package lab.Thread.task2;

public class Main {
    public static void main(String[] args) {
        MyThread thread=new MyThread();
        System.out.println("Состояние потока перед его запуском - " + thread.getState());
        thread.start();
        System.out.println("Состояние потока после его запуска - " + thread.getState());
    }
}
