package lab6.task3;

public class Truck extends Car{
    private int wheelQuantity;
    private int maxwheight;

    public Truck (int w, String  m, char c, float s, int wq, int mw)
    {
        super (w,m,c,s);
        wheelQuantity=wq;
        maxwheight=mw;
    }

    @Override
    public void outPut() {
        super.outPut();
        System.out.println("Количество колес - " + wheelQuantity + ", максимальный вес - " + maxwheight);
    }
    public void newWheel (int wheelQuantity)
    {
        this.wheelQuantity=wheelQuantity;
        System.out.println("Количество колес - " + wheelQuantity);
    }
}
