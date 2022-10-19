package lab3.task3;

public class Building {
   private int floor;
    private int year;
    private String name;



    public void setBuilding(int floor, String name,int year)
    {
        this.year=year;
        this.name=name;
        this.floor=floor;
    }

    public void display (){
        System.out.println("Дом: "+floor+"-этажный, "+name+", "+year +" год, возраст здания - "+getDate() );

    }
public int getDate ()
{
    return 2022-year;
}
}

    class JavaProgram {
        public static void main(String[] args) {
Building building1 = new Building();
            Building building2 = new Building();
            building1.setBuilding(3,"школа", 1985);
            building2.setBuilding(17,"жилой дом", 2020);
            building1.display();
            building2.display();
}}
