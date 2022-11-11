package lab.Thread.task4;

public class Threads extends Thread{
    private Object object;
    Threads (Object object){
        this.object=object;
    }

    @Override
    public void run (){
        while(true){
            synchronized (object)
            {
                try {
                    System.out.println("Имя потока - " +getName());
                    object.notify();
                    object.wait();
                }
                catch (InterruptedException e){
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
