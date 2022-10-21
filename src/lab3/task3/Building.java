package lab3.task3;

import java.util.Scanner;

public class Building {
   private int floor;
    private int year;
    private String name;
    private  int nowYear;



    public void setBuilding(int floor, String name,int year)
    {
        this.year=year;
        this.name=name;
        this.floor=floor;
    }

    public void display (int nowYear){
        System.out.println("Дом: "+floor+"-этажный, "+name+", "+year +" год, возраст здания - "+getDate(nowYear) );

    }

public int getDate (int nowYear)
{
    return nowYear-year;
}
}

    class JavaProgram {
        public static void main(String[] args) {
Building building1 = new Building();
            Building building2 = new Building();
            building1.setBuilding(3,"школа", 1985);
            building2.setBuilding(17,"жилой дом", 2020);
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите текущий год: ");
            int i = scanner.nextInt();
            building1.display(i);
            building2.display(i);
}}
