package lab1.task6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int b = scanner.nextInt();


        switch (b%2) {
            case (0):
                if (b > 100) {
                    System.out.println("Выход за пределы диапазона");
                }
                else {
                    System.out.println("Четное");
                }
                break;
            case (1):
                System.out.println("Нечетное");
                break;
        }
    }
}
