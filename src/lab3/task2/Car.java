package lab3.task2;

public class Car {
     Color color;
     String brand;
   double weight;
public Car (){

}
   public Car (Color color){
       this.color=color;
   }
   public Car (Color color, double weihgt){
       this.color=color;
       this.weight=weight;
   }
    void display(){
        System.out.println("Автомобиль:"+ color+ ", "+brand+ ", "+weight + " тн");
    }
}
//get set
class JavaProgram {
    public static void main(String[] args) {
     Car car1=new Car();
        Car car2=new Car();
     car1.brand = "Suzuki";
     car2.brand = "BMW";
     car1.color=Color.WHITE;
     car2.color=Color.BLACK;
     car1.weight=3.2;
     car2.weight=2.8;
     car1.display();
     car2.display();
     Car car3 = new Car(Color.RED);
    Car car4 = new Car(Color.SILVER, 1.7);
     car3.display();
     car4.display();
    }}