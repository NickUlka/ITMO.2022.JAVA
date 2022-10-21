package lab3.task2;

public class Car {



   private Color color;
    private String brand;
    private double weight;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color=" + color +
                ", brand='" + brand + '\'' +
                ", weight=" + weight +
                '}';
    }
    public Car() {
    }

    public Car(Color color) {
        this.color = color;
    }

    public Car(Color color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    void display() {
        System.out.println(toString());
    }
}


class JavaProgram {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        car1.setBrand("Suzuki");
        car2.setBrand("BMW");
        car1.setColor(Color.WHITE);
        car2.setColor(Color.BLACK);
        car1.setWeight(3.2);
        car2.setWeight(2.8);
        car1.display();
        car2.display();
        Car car3 = new Car(Color.RED);
        Car car4 = new Car(Color.SILVER, 1.7);
        car3.display();
        car4.display();
    }
}