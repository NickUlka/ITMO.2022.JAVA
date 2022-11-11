package lab.Thread.task3;

public class Count {
    int count = 0;

   synchronized public void increment() {
        count = count + 1;
    }
    public int getCount() {
        return count;
    }
}
