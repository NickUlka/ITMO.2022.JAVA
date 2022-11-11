package lab.Thread.task3;

class CountThread extends Thread {
    Count counter;

    CountThread(Count counter) {
        this.counter = counter;
    }
@Override
    public void run() {
            for (int i = 1; i < 1001; i++) {
                counter.increment();
        }
    }
}
