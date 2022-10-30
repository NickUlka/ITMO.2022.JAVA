package lab4.part1;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.print("\nВведите второе число: ");
        int num2 = scanner.nextInt();
        System.out.print("\nВведите третье число: ");
        int num3 = scanner.nextInt();

        if (sumEqual(num1, num2, num3)) {
            System.out.print("\nВторое число больше первого числа, а третье число больше второго числа - " + sumEqual(num1, num2, num3));
        } else {
            System.out.print("\nВторое число больше первого числа, а третье число больше второго числа - " + sumEqual(num1, num2, num3));
        }

    }

    public static boolean sumEqual(int num1, int num2, int num3) {
        return (num2 > num1) && (num3 > num2);
    }
}
