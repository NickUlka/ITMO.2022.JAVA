package lab6.task3;

public class Main {
    public static void main(String[] args) {
        Truck truck=new Truck(10,"Volvo", 'к', 200, 6, 15);
        truck.outPut();
        System.out.println("====================");
        truck.newWheel(8);
        System.out.println("====================");
        truck.outPut();
    }
}
