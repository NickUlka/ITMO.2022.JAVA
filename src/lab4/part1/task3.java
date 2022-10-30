package lab4.part1;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.print("\nВведите второе число: ");
        int num2 = scanner.nextInt();
        System.out.print("\nВведите третье число: ");
        int num3 = scanner.nextInt();

        if (sumEqual(num1,num2,num3)){
            System.out.print("\nСумма двух чисел равно третьему числу: " + (sumEqual(num1,num2,num3)));
        }
        else { System.out.print("\nСумма двух чисел равно третьему числу: " + (sumEqual(num1,num2,num3)));}
    }
    public static boolean  sumEqual (int num1, int num2, int num3)
    {

        return num1+num2==num3;
    }
}
