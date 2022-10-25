package lab4.part2;

import java.util.Arrays;
import java.util.Scanner;

public class task2 {
    private static int[] array;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int length = scanner.nextInt();
        System.out.print("Введите числа массива: \n");
        inputArray(length);
        System.out.println("Ваш массив: " + Arrays.toString(array));
    }

    public static void inputArray(int length) {
        array=new int [length];
        for (int i = 0; i < array.length; i++) {
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            array[i] =num;
        }
    }

}
