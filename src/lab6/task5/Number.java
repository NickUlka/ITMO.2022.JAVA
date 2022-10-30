package lab6.task5;

import java.util.Scanner;

public class Number {
    private int age;
    Scanner scanner = new Scanner(System.in);
    Scanner scanner2= new Scanner(System.in);

    public void setAge() {
        System.out.print("Введите возраст: ");
        this.age = scanner.nextInt();
    }


    public int getAge() {
        return age;
    }

    public Number() {
    }
}

