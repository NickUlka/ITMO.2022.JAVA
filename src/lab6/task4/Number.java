package lab6.task4;

import java.util.Scanner;

public class Number {
    private int number;
    Scanner scanner = new Scanner(System.in);

    public void setNumber() {
        System.out.print("Введите целое число: ");
        this.number = scanner.nextInt();
    }

    public int getNumber() {
        return number;
    }

    public Number() {
    }
}

