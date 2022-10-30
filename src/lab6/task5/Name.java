package lab6.task5;

import java.util.Scanner;

public class Name extends Number{
    private String name;

    @Override
    public void setAge() {
        super.setAge();
        System.out.print("Введите имя: ");
        this.name = scanner2.nextLine();
    }



    public void display(){
        System.out.println("Ваше имя - "+name+", Ваш возраст - " +super.getAge());
    }
}
