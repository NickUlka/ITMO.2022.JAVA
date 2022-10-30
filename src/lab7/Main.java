package lab7;

public class Main {
    public static void main(String[] args) {
        Plane plane=new Plane();
        Plane.Wing wing = plane.new Wing();
        wing.setWingWeight(5);
        Plane plane2=new Plane();
        Plane.Wing wing2 = plane2.new Wing();
        wing2.setWingWeight(10);
    }
}
